import android.content.Context
import android.widget.ArrayAdapter
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.travelinindia.R
import com.example.travelinindia.activities.models.AirportDetails
import com.example.travelinindia.activities.models.StationNameAndCode

class AirportAutoCompleteAdapter(
    context: Context,
    private val stationList: List<AirportDetails>
) : ArrayAdapter<String>(context, R.layout.preferences_list_layout), Filterable {

    private val stationFilter = StationFilter()
    private val stationListFull: List<AirportDetails> = ArrayList(stationList)

    override fun getCount(): Int {
        return stationList.size
    }

    override fun getItem(position: Int): String? {
        return ("${stationList[position].Name}, ${stationList[position].IATACode}")
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {
            val inflater = LayoutInflater.from(context)
            convertView = inflater.inflate(R.layout.preferences_list_layout, parent, false)
        }

        val station = stationList[position]
        val stationNameTextView = convertView!!.findViewById<TextView>(R.id.preference_tv)

        // Display both station name and code separated by a comma
        val text = "${station.Name}, ${station.IATACode}"
        stationNameTextView.text = text

        return convertView
    }

    override fun getFilter(): Filter {
        return stationFilter
    }

    inner class StationFilter : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val results = FilterResults()
            val filteredList: MutableList<AirportDetails> = ArrayList()

            if (constraint.isNullOrEmpty()) {
                filteredList.addAll(stationListFull)
            } else {
                val filterPattern = constraint.toString().trim()

                for (station in stationListFull) {
                    if (station.Name!!.contains(filterPattern) || station.IATACode!!.contains(filterPattern)) {
                        filteredList.add(station)
                    }
                }
            }
            results.values = filteredList
            results.count = filteredList.size
            return results
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            clear()
            if (results != null && results.count > 0) {
                addAll(results.values as List<String>)
            } else {
                notifyDataSetInvalidated()
            }
        }
    }
}
