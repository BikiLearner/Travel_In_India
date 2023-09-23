package com.example.travelinindia.activities.activitiees

import com.example.travelinindia.activities.models.AllStateModel
import com.example.travelinindia.activities.models.PopularDestinationModel

class GetTheDataToSetInApp {
    open fun dataForEveryState():ArrayList<AllStateModel>{
        val list=ArrayList<AllStateModel>()

        // West Bengal
        val westBengalDescription = "West Bengal, situated in the eastern part of India, is a diverse and culturally rich state known for its historical significance, artistic heritage, and natural beauty. The capital city, Kolkata, is a hub of cultural activities, literature, and art, and it played a pivotal role in India's struggle for independence.\n\nThe state is renowned for its festivals, including Durga Puja, which is celebrated with grandeur and enthusiasm. West Bengal's cuisine is famous for its mouthwatering sweets like rasgulla and sandesh, as well as flavorful dishes like biryani and macher jhol (fish curry).\n\nWest Bengal's geography is varied, ranging from the fertile Gangetic plains to the lush Sundarbans mangrove forest, home to the Bengal tiger. The Darjeeling Himalayan region is known for its picturesque tea plantations and stunning mountain landscapes."

        val data1 = AllStateModel(
            "West Bengal",
            westBengalDescription,
            "https://lh5.googleusercontent.com/p/AF1QipN77f0-qQUzJXkTAm18UANb7AAk3a5x9P3lcOsE=w548-h318-n-k-no",
            getPopulardestinationLink(),0,5
        )
        list.add(data1)

// Bihar
        val biharDescription = "Bihar, located in eastern India, is a state with a rich historical and cultural heritage. It is home to ancient sites like Nalanda and Rajgir, which were centers of learning and spirituality in ancient India. The Mahabodhi Temple in Gaya is a significant pilgrimage site for Buddhists.\n\nBihar's cuisine is known for its variety, with dishes like litti chokha and sattu being popular. The state's festivals, such as Chhath Puja, are celebrated with great fervor.\n\nThe state's diverse landscape includes fertile plains and the Ganges River, making it an important agricultural region."

        val data2 = AllStateModel(
            "Bihar",
            biharDescription,
            "https://lh5.googleusercontent.com/p/AF1QipNc1TwA_lENG6Ft6mR-cPbvzocM1F3YDKkFu3yS=w548-h318-n-k-no",
            getPopulardestinationLink(),5,10
        )
        list.add(data2)
// Assam
        val assamDescription = "Assam, located in northeastern India, is known for its lush green landscapes, rich biodiversity, and unique culture. The state is famous for its tea, and the tea gardens of Assam produce some of the finest tea in the world. Kaziranga National Park, a UNESCO World Heritage Site, is home to the one-horned rhinoceros and various other wildlife species.\n\nThe Kamakhya Temple in Guwahati is a revered pilgrimage site. Assam's cuisine features rice as a staple and various fish and meat dishes, often flavored with local herbs and spices."

        val data3 = AllStateModel(
            "Assam",
            assamDescription,
            "https://www.kaziranganationalpark-india.com/blog/wp-content/uploads/2022/11/Kaziranga-National-Park-in-Assam_1553856939.jpg",
            getPopulardestinationLink(),10,15
        )
        list.add(data3)

// Arunachal Pradesh
        val arunachalPradeshDescription = "Arunachal Pradesh, in the northeastern part of India, is known for its pristine natural beauty and rugged terrain. The state is home to the Tawang Monastery, one of the largest Buddhist monasteries in the world, and Sela Pass, which offers breathtaking views of the Himalayas.\n\nArunachal Pradesh's landscapes include lush valleys, dense forests, and snow-capped mountains. The Golden Pagoda in Namsai is a prominent Buddhist pilgrimage site.\n\nThe state's cuisine is influenced by its diverse tribes and features dishes like thukpa and momos."

        val data4 = AllStateModel(
            "Arunachal Pradesh",
            arunachalPradeshDescription,
            "https://s3.ap-south-1.amazonaws.com/stage.anvayins.com/SiteImages/Attraction/1661634028002_DSC_9862.jpg",
            getPopulardestinationLink(),15,20
        )
        list.add(data4)

// Continue with descriptions for other states...
// Sikkim
        val sikkimDescription = "Sikkim, nestled in the northeastern Himalayas, is a land of scenic beauty and tranquility. It is known for its pristine landscapes, lush green valleys, and majestic mountains. Nathula Pass, located on the border with China, is a popular attraction offering stunning views of the Himalayan range.\n\nThe capital city, Gangtok, is known for its vibrant culture, Buddhist monasteries, and the famous M.G. Marg. Pelling, another popular destination, provides panoramic views of Kanchenjunga, the world's third-highest peak."

        val data5 = AllStateModel(
            "Sikkim",
            sikkimDescription,
            "https://www.sikkimtourismindia.com/img/silk-route.jpg",
            getPopulardestinationLink(),20,25
        )
        list.add(data5)

// Meghalaya
        val meghalayaDescription = "Meghalaya, known as the 'Abode of Clouds,' is a northeastern state blessed with lush greenery and picturesque landscapes. Shillong, the capital, is often referred to as the 'Scotland of the East' due to its scenic beauty. The state is famous for its stunning waterfalls, including the Seven Sisters Falls.\n\nMeghalaya is also known for its unique living root bridges, which are a UNESCO World Heritage Site. Cherrapunji, one of the wettest places on Earth, is located here, offering breathtaking views of landscapes and waterfalls."

        val data6 = AllStateModel(
            "Meghalaya",
            meghalayaDescription,
            "https://static.india.com/wp-content/uploads/2019/12/74812447_1823320437812585_2873489448364646428_n.jpg",
            getPopulardestinationLink(),25,30
        )
        list.add(data6)

// Continue with descriptions for other states...
// Tamil Nadu
        val tamilNaduDescription = "Tamil Nadu, located in the southern part of India, is a state with a rich cultural heritage and history. The city of Madurai is famous for the Meenakshi Amman Temple, a magnificent example of Dravidian architecture. Ooty and Coonoor in the Nilgiri Hills offer a refreshing escape with their tea gardens and cool climate. Chennai, the capital, is a bustling metropolis known for its vibrant arts scene and Marina Beach, one of the longest urban beaches in the world."

        val data7 = AllStateModel(
            "Tamil Nadu",
            tamilNaduDescription,
            "https://encrypted-tbn3.gstatic.com/licensed-image?q=tbn:ANd9GcSHeKqteyBN67zsiY2jlNXEJjhnar0qaqpZ3V8kpgmB5MjFs-j5umZIxItaGA5o6-mWpqD8bpzq8bD7BISdy-GVu4PVqOwV",
            getPopulardestinationLink(),30,35
        )
        list.add(data7)

// Haryana
        val haryanaDescription = "Haryana, situated in northern India, is a state with a mix of historical sites and modern cities. Faridabad and Gurugram are major industrial and business hubs, while Karnal is known for its agricultural significance. Morni Hills offers a serene getaway with its lakes and forests. Rohtak and its educational institutions add to the state's diversity."

        val data8 = AllStateModel(
            "Haryana",
            haryanaDescription,
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FFaridabad&psig=AOvVaw39bm6_IUF8ia0QfT0UzQDJ&ust=1695492420356000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCOCgqs7nvoEDFQAAAAAdAAAAABAE",
            getPopulardestinationLink(),35,40
        )
        list.add(data8)

// Manipur
        val manipurDescription = "Manipur, in northeastern India, is known for its scenic beauty and rich cultural traditions. Kangla Fort in Imphal holds historical significance, and the city itself is vibrant with its markets and festivals. Ukhrul, Thoubal, and Chandel offer glimpses of Manipur's natural beauty, while Imphal remains the cultural heart of the state."

        val data9 = AllStateModel(
            "Manipur",
            manipurDescription,
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tourmyindia.com%2Fstates%2Fmanipur%2Fkangla-fort.html&psig=AOvVaw16Ouq1K5H4TagfgZNmv2jA&ust=1695492838746000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCMjuhZXpvoEDFQAAAAAdAAAAABAE",
            getPopulardestinationLink(),40,45
        )
        list.add(data9)

// Jharkhand
        val jharkhandDescription = "Jharkhand, located in eastern India, is known for its natural beauty and tribal culture. Dassam Falls and Jonha Falls near Ranchi are popular tourist spots. Jamshedpur, an industrial city, offers insights into India's steel industry. Jubilee Park in Jamshedpur is a serene attraction. Ranchi, the capital, is known for its picturesque landscapes and water bodies."

        val data10 = AllStateModel(
            "Jharkhand",
            jharkhandDescription,
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FJamshedpur&psig=AOvVaw1oj_TGnCNtEAB-XNRkzXvX&ust=1695493442815000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCIC5gLXrvoEDFQAAAAAdAAAAABAE",
            getPopulardestinationLink(),45,50
        )
        list.add(data10)

// Continue with descriptions for other states...
        val himachalPradeshDescription = "Himachal Pradesh, situated in the northern part of India, is a state known for its breathtaking landscapes and serene hill stations. Shimla, the capital, is a popular hill station with colonial-era architecture. Manali and Kullu are famous for their adventure sports and scenic beauty. Dharamshala, home to the Dalai Lama, is a hub of Tibetan culture."

        val data11 = AllStateModel(
            "Himachal Pradesh",
            himachalPradeshDescription,
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tourmyindia.com%2Fstates%2Fhimachal%2Fshimla.html&psig=AOvVaw0oMX8ARu0YRQ4AdbQsghz1&ust=1695496171177000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCLCxhZ7wvoEDFQAAAAAdAAAAABAE",
            getPopulardestinationLink(),50,55
        )
        list.add(data11)

// Mizoram
        val mizoramDescription = "Mizoram, in northeastern India, is a state known for its lush greenery and vibrant culture. Aizawl, the capital, offers panoramic views of the surrounding hills. The state is home to various indigenous tribes with their unique traditions and festivals. Mizoram is a paradise for nature lovers and trekkers."

        val data12 = AllStateModel(
            "Mizoram",
            mizoramDescription,
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tourmyindia.com%2Fstates%2Fmizoram.html&psig=AOvVaw3_SlzFvE-yzIm_3KHQ7MXY&ust=1695496412833000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCOiO0-rxvoEDFQAAAAAdAAAAABAD",
            getPopulardestinationLink(),55,60
        )
        list.add(data12)
        val uttarPradeshDescription = "Uttar Pradesh, often abbreviated as UP, is a diverse and culturally rich state located in northern India. It is not only the most populous state in India but also one of the country's most historically significant regions. The capital city, Lucknow, is known for its magnificent architecture and royal heritage.\n\nUttar Pradesh has a deep-rooted history and is home to several iconic monuments, including the Taj Mahal in Agra, which is a UNESCO World Heritage Site and one of the Seven Wonders of the World. The state is also known for its spiritual significance, with cities like Varanasi, Ayodhya, and Mathura being sacred to multiple religions.\n\nThe cuisine of Uttar Pradesh is renowned for its delectable dishes such as kebabs, biryanis, and sweets like jalebi and petha. The state's culture is colorful and vibrant, with traditional dance forms like Kathak and classical music forms like Hindustani music flourishing here.\n\nUttar Pradesh's natural beauty is evident in its lush landscapes, including the fertile Gangetic plains and the majestic Himalayan foothills in the north. The state offers a diverse range of experiences, from historical and religious pilgrimages to culinary delights and natural wonders.\n\nIn summary, Uttar Pradesh is a state of great cultural and historical significance, offering a fascinating blend of heritage, spirituality, and natural beauty."

        val data13 = AllStateModel(
            "Uttar Pradesh",
            uttarPradeshDescription,
            "https://lh5.googleusercontent.com/p/AF1QipNoPRboy4KPbNA1OfjciSYxo2EbUCngUpmLIHxi=w548-h318-n-k-no",
            getPopulardestinationLink(),60,65
        )
        list.add(data13)
        val rajasthanDescription = "Rajasthan, often referred to as the 'Land of Kings,' is a vibrant and culturally rich state located in northwestern India. It is renowned for its majestic palaces, historic forts, and colorful traditions. The state's capital city, Jaipur, known as the 'Pink City,' is famous for its stunning architecture, including the Hawa Mahal and Amer Fort.\n\nRajasthan boasts a rich history, with many of its cities serving as the former princely states of India. The state is home to iconic landmarks such as the Udaipur City Palace, Jaisalmer Fort, and the Mehrangarh Fort in Jodhpur, each showcasing the grandeur of Rajput architecture.\n\nThe culture of Rajasthan is a tapestry of music, dance, art, and festivals. Traditional folk music and dance forms like Ghoomar and Kalbelia are a vibrant part of the state's heritage. Rajasthan's cuisine is famous for its spicy curries, dal-bati-churma, and sweets like ghewar and malpua.\n\nRajasthan's landscape is diverse, ranging from the Thar Desert in the west to the lush Aravalli hills in the southeast. The state's natural beauty is complemented by wildlife sanctuaries and national parks, making it a haven for wildlife enthusiasts.\n\nIn summary, Rajasthan is a captivating state that offers a unique blend of history, culture, and natural beauty, making it a must-visit destination for travelers."

        val data14 = AllStateModel(
            "Rajasthan",
            rajasthanDescription,
            "https://lh5.googleusercontent.com/p/AF1QipPvRLMbvf0so_nFsawhu_CnVceeNcM3RL1Eu-lH=w548-h318-n-k-no", // Replace with the actual image link
            getPopulardestinationLink(), // You can replace this with the actual popular destination links
            65,
            70
        )
        list.add(data14)

// Continue with descriptions for other states...



        return list
    }
    fun getPopulardestinationLink():ArrayList<PopularDestinationModel>{
        // Create an ArrayList to store the PopularDestinationModel objects
        val list = ArrayList<PopularDestinationModel>()
        val data1 = PopularDestinationModel(
            "Victoria Memorial Hall",
            "Victoria Memorial Hall, an architectural marvel located in the heart of Kolkata, stands as a resplendent tribute to the legacy of Queen Victoria and the rich imperial history of India. This iconic monument, fashioned with gleaming white marble, is not merely a structure but a living testament to India's colonial past. Its expansive gardens, adorned with verdant foliage and vibrant blooms, offer a tranquil haven for visitors. Inside, the memorial houses a remarkable collection of historical artifacts, artwork, and memorabilia that eloquently narrate the captivating story of Kolkata's evolution during the British Raj. A visit to Victoria Memorial is a profound journey through time, culture, and artistic brilliance.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcRWSw1rib3_qwhgMqPFgBu5EFLICVg6hzaZE4I0cPiUiG0R16dz_Wd11tSUjEToBHPNpL2Zm69PFz3YU1-xJEHR2B58BMk2"
        )
        list.add(data1)

// Create and add data for the second destination
        val data2 = PopularDestinationModel(
            "Darjeeling",
            "Darjeeling, cradled in the gentle embrace of the Himalayan foothills, is a captivating town renowned for its emerald tea gardens. These sprawling plantations produce some of the world's most sought-after teas, enveloping the region in a fragrant embrace. As you traverse the undulating hills adorned with vibrant green tea bushes, you'll be greeted by breathtaking vistas of snow-capped peaks, including the mighty Kanchenjunga. Beyond tea, Darjeeling boasts a rich cultural tapestry with influences from Tibetan and Nepali traditions, making it a diverse and charming destination that beckons explorers from around the globe.",
            "https://3.imimg.com/data3/EF/FQ/MY-3370654/tea-gardens-of-darjeeling-the-hidden-paradise-500x500.jpg"
        )
        list.add(data2)

// Data for the third destination
        val data3 = PopularDestinationModel(
            "Sundarban",
            "The Sundarbans, a UNESCO World Heritage Site, is a sprawling mangrove forest located at the delta of the Ganges, Brahmaputra, and Meghna rivers in India and Bangladesh. This unique ecosystem is home to the elusive Bengal tiger and a myriad of other wildlife species. As you navigate the intricate waterways, you'll witness the enchanting beauty of the mangroves, with their interwoven roots and diverse flora and fauna. The Sundarbans is not only a sanctuary for wildlife enthusiasts but also a place of immense ecological importance, contributing to the conservation of our planet's biodiversity.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.holidify.com%2Fplaces%2Fsundarban-national-park%2F&psig=AOvVaw3FGNddGrniwnvUC3tIdsHL&ust=1695503269219000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCND1tIOQv4EDFQAAAAAdAAAAABAE"
        )
        list.add(data3)

// Data for the fourth destination
        val data4 = PopularDestinationModel(
            "Jaldapara National Park",
            "Jaldapara National Park, situated in the enchanting landscape of West Bengal, beckons nature enthusiasts and wildlife lovers alike. This pristine sanctuary is a haven for endangered one-horned rhinoceros and a diverse array of other fauna. Embark on an elephant safari through its lush forests, and you might encounter the majestic rhinoceros, elusive leopards, and numerous avian species. The park's untamed beauty and biodiversity make it an ideal destination for those seeking a rendezvous with the wild amidst the tranquility of nature.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Elephant_safari.jpg/284px-Elephant_safari.jpg"
        )
        list.add(data4)

// Data for the fifth destination
        val data5 = PopularDestinationModel(
            "Ajodhya Pahar Purulia",
            "Ajodhya Pahar, nestled in the heart of Purulia, is a hidden gem that offers a perfect blend of natural beauty and tranquility. This picturesque hill range boasts lush green landscapes, captivating waterfalls, and rugged terrain that beckons adventure seekers and nature enthusiasts. As you explore its pristine trails, you'll be greeted by panoramic vistas of rolling hills and dense forests. Ajodhya Pahar is an ideal destination for trekking, birdwatching, and unwinding amidst the serene lap of nature, making it a haven for those seeking an offbeat and rejuvenating escape.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Ayodha_Hills.jpg/272px-Ayodha_Hills.jpg"
        )
        list.add(data5)

// Now, the ArrayList contains data for all the destinations with the provided links
// Create and add data for the sixth destination
        // Data for the sixth destination
        val data6 = PopularDestinationModel(
            "Rajgir",
            "Rajgir, an ancient city nestled in the scenic landscape of Bihar, is steeped in history and spirituality. It is believed to be the place where Lord Buddha spent many years in meditation and where several important events in his life occurred. The city is surrounded by verdant hills and offers a tranquil environment for those seeking solace and reflection. Rajgir is also known for its hot springs, which are believed to have therapeutic properties. Visitors can explore the ruins of the ancient Nalanda University and the Griddhakuta Hill, which holds religious significance. A visit to Rajgir is a journey through time, spirituality, and natural beauty.",
            "https://feeds.abplive.com/onecms/images/uploaded-images/2023/03/27/14e4a971f8a14913fe177c71d819d61918664.jpg?impolicy=abp_cdn&imwidth=650"
        )
        list.add(data6)

// Create and add data for the seventh destination
        val data7 = PopularDestinationModel(
            "Nalanda",
            "Nalanda, an archaeological marvel in Bihar, is renowned for its ancient Nalanda University, which was once a center of learning and Buddhist studies. The ruins of this prestigious institution offer a glimpse into India's rich intellectual history. Visitors can explore ancient monasteries, temples, and libraries that were an integral part of this ancient seat of learning. The Mahavira Temple and Nalanda Archaeological Museum are other attractions that provide insights into the region's cultural and historical heritage. Nalanda is a place where history comes alive, making it a must-visit destination for history buffs and culture enthusiasts.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Temple_No.-_3%2C_Nalanda_Archaeological_Site.jpg/250px-Temple_No.-_3%2C_Nalanda_Archaeological_Site.jpg"
        )
        list.add(data7)

// Create and add data for the eighth destination
        val data8 = PopularDestinationModel(
            "Deoghar",
            "Deoghar, often referred to as 'the cultural capital of Jharkhand,' is a spiritual haven located in the Chota Nagpur Plateau. It is famous for the Baidyanath Jyotirlinga Temple, one of the twelve sacred shrines dedicated to Lord Shiva. Pilgrims flock to Deoghar to seek the blessings of Lord Shiva and participate in the holy rituals. Apart from its religious significance, Deoghar is known for its scenic beauty, with lush forests and rolling hills that invite nature lovers and trekkers. The town's serene ambiance and spiritual aura make it a place of profound significance and natural charm.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Baba_Dham.jpg/268px-Baba_Dham.jpg"
        )
        list.add(data8)

// Create and add data for the ninth destination
        val data9 = PopularDestinationModel(
            "Gaya",
            "Gaya, a city in Bihar, holds immense religious importance for Hindus and Buddhists alike. It is renowned as the place where Lord Buddha attained enlightenment under the Bodhi Tree. The Mahabodhi Temple complex, a UNESCO World Heritage Site, is the spiritual heart of Gaya and a pilgrimage site for Buddhists from around the world. Gaya is also a center for ancestral worship, and many Hindus visit to perform pind daan rituals for their deceased ancestors along the sacred Falgu River. With its rich history and religious significance, Gaya is a place where spirituality and tradition converge.",
            "https://1.bp.blogspot.com/-8wmAe7_XZRs/UuSkL772krI/AAAAAAAABIM/gzzgz32c2kA/s1600/Mahabodhi+temple,+Bodh+Gaya,.jpg"
        )
        list.add(data9)

// Create and add data for the tenth destination
        val data10 = PopularDestinationModel(
            "Sher Shah Suri Tomb",
            "The Sher Shah Suri Tomb in Sasaram, Bihar, is a testament to the architectural brilliance of the Mughal era. This striking mausoleum was built in memory of Sher Shah Suri, the founder of the Suri dynasty. The tomb's grandeur and intricate design reflect the Indo-Islamic architectural style of the time. Its red sandstone structure and impressive dome make it a visual masterpiece. Visitors can explore the surrounding garden and soak in the historical significance of this site. The Sher Shah Suri Tomb is a captivating destination for history enthusiasts and architecture aficionados.",
            "https://tourism.bihar.gov.in/content/dam/bihar-tourism/images/category_a/rohtas/sher_shah_suri_tomb__sasaram/sher-sha-shuri-tomb.jpg/jcr:content/renditions/cq5dam.web.1280.765.jpeg"
        )
        list.add(data10)

// Now, the ArrayList contains data for all the destinations with the provided links
// Data for the eleventh destination
        val data11 = PopularDestinationModel(
            "Kaziranga National Park",
            "Kaziranga National Park, located in the heart of Assam, is a UNESCO World Heritage Site and a sanctuary for the conservation of the Indian one-horned rhinoceros. Spanning over 900 square kilometers, the park is a biodiverse haven, home to numerous other species of wildlife, including tigers, elephants, and various bird species. The park's unique landscape consists of grasslands, wetlands, and forests, making it a remarkable destination for wildlife enthusiasts and nature lovers. Visitors can embark on thrilling safaris to catch glimpses of these magnificent creatures in their natural habitat, making Kaziranga a must-visit for those seeking an adventurous and wildlife-rich experience.",
            "https://www.kaziranganationalpark-india.com/blog/wp-content/uploads/2022/11/Kaziranga-National-Park-in-Assam_1553856939.jpg"
        )
        list.add(data11)

// Create and add data for the twelfth destination
        val data12 = PopularDestinationModel(
            "Kamakhya Temple",
            "Kamakhya Temple, situated in the ancient city of Guwahati, Assam, is one of the most revered Shakti Peethas in India. The temple is dedicated to Goddess Kamakhya, the powerful goddess of fertility and desire. Perched atop the Nilachal Hill, this sacred site offers panoramic views of the city and the Brahmaputra River. The temple's unique architectural style and vibrant religious ceremonies draw pilgrims and tourists from all over the world. It is especially famous for the annual Ambubachi Mela, a grand festival celebrating the goddess's menstruation. A visit to Kamakhya Temple is a spiritual journey filled with devotion and cultural richness.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Kamakhya_Temple%2C_Guwahati.jpg/220px-Kamakhya_Temple%2C_Guwahati.jpg"
        )
        list.add(data12)

// Create and add data for the thirteenth destination
        val data13 = PopularDestinationModel(
            "Tea Garden",
            "Assam, often referred to as the 'Land of Tea,' is renowned for its lush tea gardens that stretch across picturesque landscapes. These tea estates produce some of the finest tea varieties in the world. Visitors can explore these tea gardens to witness the tea-making process, from plucking the leaves to processing. The scenic beauty of the tea gardens, with rows of tea bushes as far as the eye can see, is a sight to behold. Additionally, many tea estates offer guided tours and tea-tasting sessions, allowing visitors to savor the distinct flavors of Assam tea, making it a delightful experience for tea connoisseurs and nature enthusiasts.",
            "https://www.hlimg.com/images/stories/738X538/6_1536042716m.jpg?w=800&dpr=1.0"
        )
        list.add(data13)

// Create and add data for the fourteenth destination
        val data14 = PopularDestinationModel(
            "Balaji Temple",
            "Purva Tirupati Balaji Temple, located in Guwahati, Assam, is a spiritual gem dedicated to Lord Venkateswara, an incarnation of Lord Vishnu. The temple's stunning architecture and serene ambiance make it a popular place of worship and pilgrimage. Devotees flock to seek the blessings of Lord Balaji and participate in religious ceremonies. The temple complex also features beautifully landscaped gardens and serene surroundings, providing a tranquil escape from the bustling city life. A visit to the Balaji Temple offers a harmonious blend of spirituality and architectural beauty.",
            "https://www.trawell.in/admin/images/upload/424918781Guwahati_Purva_Tirupati_Balaji_Temple_Main.jpg"
        )
        list.add(data14)

// Create and add data for the fifteenth destination
        val data15 = PopularDestinationModel(
            "Majuli",
            "Majuli, the world's largest river island, is a hidden gem in Assam's Brahmaputra River. This island is a unique blend of natural beauty, rich culture, and spirituality. Majuli is known for its lush green landscapes, tranquil monasteries (satras), and vibrant festivals. The satras are centers of Assamese culture, where traditional music, dance, and crafts thrive. The island is also a birdwatcher's paradise, with a variety of avian species. Visitors can explore the serene villages, interact with the local Mishing tribe, and witness traditional art forms. Majuli is a destination where time seems to stand still, making it perfect for those seeking peace and cultural immersion.",
            "https://adventurerivercruises.com/wp-content/uploads/2019/01/Majuli-Island-860x564.jpg"
        )
        list.add(data15)


        // Create and add data for the sixteenth destination
        // Data for the sixteenth destination
        val data16 = PopularDestinationModel(
            "Golden Pagoda",
            "The Golden Pagoda, also known as the Kongmu Kham in Tibetan, is a magnificent Buddhist stupa located in Namsai, Arunachal Pradesh. This stunning golden structure is a symbol of peace and spirituality. The pagoda stands tall amidst lush greenery and serene surroundings, making it a perfect place for meditation and reflection. Visitors can explore the pagoda's intricate architecture, adorned with golden accents and Buddhist symbols. The tranquility and scenic beauty of the Golden Pagoda make it a serene and awe-inspiring destination for those seeking spiritual solace and cultural enrichment.",
            "https://s3.ap-south-1.amazonaws.com/stage.anvayins.com/SiteImages/Attraction/1661634028002_DSC_9862.jpg"
        )
        list.add(data16)

// Create and add data for the seventeenth destination
        val data17 = PopularDestinationModel(
            "Tawang Monastery",
            "Tawang Monastery, also known as Galden Namgey Lhatse, is one of the largest monasteries in India and a significant pilgrimage site for Buddhists. Located in the town of Tawang in Arunachal Pradesh, this monastery is perched on a hilltop, offering breathtaking views of the surrounding Himalayan landscape. The monastery is known for its impressive three-story high golden statue of Lord Buddha, intricate murals, and a vast library of ancient scriptures. Visitors can experience the spirituality and serenity of the monastery while also enjoying the natural beauty of Tawang. Tawang Monastery is a must-visit for those interested in Buddhism and Himalayan culture.",
            "https://indiano.travel/wp-content/uploads/2022/03/The-colour-prayer-buddha-statue-on-the-hillside-which-surrounding-Tawang..jpg"
        )
        list.add(data17)

// Create and add data for the eighteenth destination
        val data18 = PopularDestinationModel(
            "Sela Pass",
            "Sela Pass, situated at an altitude of over 13,000 feet, is a high mountain pass in Arunachal Pradesh. It is known for its breathtaking beauty and is often covered in snow during the winter months. The pass offers panoramic views of snow-capped peaks and crystal-clear lakes, making it a paradise for nature enthusiasts and adventure seekers. The area surrounding Sela Pass is home to a variety of wildlife, including yaks and migratory birds. Whether you're a trekking enthusiast or simply looking to soak in the serene Himalayan landscapes, a visit to Sela Pass promises an unforgettable experience.",
            "https://live.staticflickr.com/65535/48556039886_172c28b852_b.jpg"
        )
        list.add(data18)

// Create and add data for the nineteenth destination
        val data19 = PopularDestinationModel(
            "Bomdila",
            "Bomdila, a picturesque town in Arunachal Pradesh, is known for its stunning landscapes, Buddhist monasteries, and vibrant Tibetan culture. The town is surrounded by lush forests and snow-capped peaks, making it a haven for nature lovers and trekkers. Bomdila Monastery, also known as Gentse Gaden Rabgyel Lling Monastery, is a prominent attraction, known for its beautiful architecture and spiritual significance. Visitors can explore the town's serene surroundings, interact with the local Monpa tribe, and enjoy panoramic views of the Eastern Himalayas. Bomdila is a delightful destination for those seeking tranquility and cultural immersion.",
            "https://www.tourism-of-india.com/pictures/travel_guide/attractions/thmb/bomdila-109.jpeg"
        )
        list.add(data19)

// Create and add data for the twentieth destination
        val data20 = PopularDestinationModel(
            "Itanagar",
            "Itanagar, the capital of Arunachal Pradesh, is a city that beautifully blends tradition and modernity. The city is known for its rich tribal culture, historical sites, and scenic beauty. The Gompa Buddhist Temple, with its distinctive architecture and serene ambiance, is a must-visit attraction. Itanagar offers a glimpse into the unique customs and traditions of the local tribes through its markets, festivals, and handicrafts. Surrounded by lush green hills, the city provides a peaceful escape with opportunities for trekking and exploring the natural beauty of the region. Itanagar is a place where tradition meets contemporary life, making it a fascinating destination for travelers.",
            "https://asoulwindow.com/wp-content/uploads/2021/01/Gompa-Buddhist-Temple-view-Itanagar-arunachal-tourism-23.jpg"
        )
        list.add(data20)

// Now, the ArrayList contains data for all the destinations with the provided links
// Create and add data for the twenty-first destination
        // Data for the twenty-first destination
        val data21 = PopularDestinationModel(
            "Nathula",
            "Nathula Pass, located in the Indian state of Sikkim, is a high-altitude mountain pass that connects India to the Tibetan Autonomous Region of China. Situated at an elevation of over 14,000 feet, Nathula is known for its mesmerizing views of snow-capped peaks and pristine landscapes. Visitors can experience the thrill of standing at the Indo-China border and witness the scenic beauty that surrounds the pass. Nathula Pass is also known for its historical significance, as it was a part of the ancient Silk Route. It offers a unique opportunity to witness the convergence of natural beauty and history in the heart of the Himalayas.",
            "https://www.sikkimtourismindia.com/img/silk-route.jpg"
        )
        list.add(data21)

// Create and add data for the twenty-second destination
        val data22 = PopularDestinationModel(
            "Ravangla",
            "Ravangla, a serene town in Sikkim, is a hidden gem for nature enthusiasts and those seeking tranquility. Surrounded by lush greenery and framed by the majestic Kanchenjunga mountain range, Ravangla offers breathtaking views of the Himalayas. The town is known for its peaceful monasteries, such as Ralong Monastery and Bon Monastery, which provide a spiritual escape. Visitors can also explore the beautiful Buddha Park with its towering Buddha statue and well-maintained gardens. Ravangla is an ideal destination for meditation, trekking, and birdwatching, making it a perfect retreat for nature lovers.",
            "https://static2.tripoto.com/media/filter/nl/img/395815/Image/1658660949_psx_20180502_204057.jpg.webp"
        )
        list.add(data22)

// Create and add data for the twenty-third destination
        val data23 = PopularDestinationModel(
            "Gangtok",
            "Gangtok, the capital city of Sikkim, is a vibrant and picturesque destination nestled in the Eastern Himalayas. This charming city is known for its pleasant weather, lush landscapes, and a blend of cultures and traditions. Visitors can explore the bustling MG Marg, lined with shops and eateries, and enjoy panoramic views from Ganesh Tok and Tashi View Point. Gangtok is also a gateway to adventure with opportunities for trekking, paragliding, and river rafting. The city's monasteries, such as Enchey Monastery and Rumtek Monastery, provide insights into Tibetan Buddhism. Gangtok is a perfect blend of natural beauty, spirituality, and modern amenities.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/M.G._Marg%2C_Gangtok_01.jpg/218px-M.G._Marg%2C_Gangtok_01.jpg"
        )
        list.add(data23)

// Create and add data for the twenty-fourth destination
        val data24 = PopularDestinationModel(
            "Pelling",
            "Pelling, a charming town in Sikkim, is known for its panoramic views of the Kanchenjunga mountain range and lush greenery. The town offers a tranquil escape from the hustle and bustle of city life. Pelling is home to several viewpoints, including Pelling Skywalk and Singshore Bridge, where visitors can enjoy breathtaking vistas. The nearby Pemayangtse Monastery, one of the oldest monasteries in Sikkim, is a cultural and spiritual attraction. Trekkers can explore scenic trails in the surrounding forests. Pelling is a destination that immerses you in the natural beauty of the Himalayas and provides a sense of serenity.",
            "https://www.thatgoangirl.com/wp-content/uploads/2019/09/kanchenjunga-falls-pelling-sikkim-300x225.jpg"
        )
        list.add(data24)

// Create and add data for the twenty-fifth destination
        val data25 = PopularDestinationModel(
            "Yumthang",
            "Yumthang Valley, often referred to as the 'Valley of Flowers,' is a pristine and enchanting destination in Sikkim. Located at an altitude of about 11,800 feet, this valley comes alive during spring when numerous wildflowers bloom, creating a colorful carpet across the landscape. Surrounded by snow-capped peaks, Yumthang offers stunning views and is a paradise for nature lovers and photographers. The valley also boasts hot springs, which are believed to have healing properties. Yumthang is a haven for trekkers and adventure enthusiasts, making it a must-visit destination for those seeking the beauty of untouched nature.",
            "https://img.traveltriangle.com/blog/wp-content/uploads/2018/05/cover.jpg"
        )
        list.add(data25)


// Now, the ArrayList contains data for all the destinations with the provided links
// Create and add data for the twenty-sixth destination
        // Data for the twenty-sixth destination
        val data26 = PopularDestinationModel(
            "Seven Sisters Waterfall",
            "Seven Sisters Waterfall is a breathtaking natural wonder located in the northeastern state of Meghalaya, India. As the name suggests, it comprises seven stunning cascades that flow gracefully amidst lush green forests and rocky terrain. The waterfall is a sight to behold during the monsoon season when it is at its full glory, presenting a magnificent spectacle of nature's power and beauty. Visitors can also explore the surrounding area, which is rich in biodiversity and offers opportunities for trekking and nature walks. Seven Sisters Waterfall is a must-visit destination for those seeking the tranquility and grandeur of the North East.",
            "https://static.india.com/wp-content/uploads/2019/12/74812447_1823320437812585_2873489448364646428_n.jpg"
        )
        list.add(data26)

// Create and add data for the twenty-seventh destination
        val data27 = PopularDestinationModel(
            "Shillong",
            "Shillong, often referred to as the 'Scotland of the East,' is the capital city of Meghalaya and a charming hill station nestled in the Himalayas. The city is known for its picturesque landscapes, rolling hills, and pleasant climate. Shillong offers a blend of natural beauty and cultural richness, with attractions like Ward's Lake, Shillong Peak, and Elephant Falls. The local Khasi culture adds a unique charm to the city, and visitors can explore local markets and try delicious Khasi cuisine. Shillong is a perfect destination for those seeking a peaceful retreat in the lap of nature.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.hellotravel.com%2Fdeals%2F95867.html&psig=AOvVaw0Hm23zk8mHS36UGnJjz_XD&ust=1695491232772000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCIjxyZfjvoEDFQAAAAAdAAAAABAU"
        )
        list.add(data27)

// Create and add data for the twenty-eighth destination
        val data28 = PopularDestinationModel(
            "Dawki",
            "Dawki, a small town in Meghalaya, is known for its crystal-clear river and picturesque landscapes. The Umngot River in Dawki is famous for its transparent waters, allowing you to see the riverbed and fish swimming beneath. The town is a popular spot for boating and is surrounded by lush green hills. The nearby Shnongpdeng village offers opportunities for camping and adventure activities. Dawki is a serene destination for nature lovers and provides a unique experience of being close to nature's wonders.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FDawki&psig=AOvVaw0an_Pa_qOETiHq3GFyx5ZO&ust=1695491612097000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCOD4vOPkvoEDFQAAAAAdAAAAABAK"
        )
        list.add(data28)

// Create and add data for the twenty-ninth destination
        val data29 = PopularDestinationModel(
            "Tura",
            "Tura is a charming town in the West Garo Hills district of Meghalaya. It is known for its scenic beauty and tranquil surroundings. Tura is surrounded by lush green hills and is a gateway to the beautiful Garo Hills region. Visitors can explore the Balpakram National Park, which is home to diverse flora and fauna, including the endangered red panda. The town also offers insights into Garo tribal culture and traditions. Tura is an offbeat destination that allows you to connect with nature and experience the rich cultural heritage of Meghalaya.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fkaziranganationalparkassam.in%2Ftura%2F&psig=AOvVaw2H7JS95zU7jFLELTvFSiUg&ust=1695491775901000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCNj0r5vlvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data29)

// Create and add data for the thirtieth destination
        val data30 = PopularDestinationModel(
            "Jowai",
            "Jowai is the headquarters of the West Jaintia Hills district in Meghalaya. This charming town is known for its scenic beauty, tranquil atmosphere, and cultural heritage. Jowai is surrounded by lush forests and rolling hills, making it an ideal destination for nature enthusiasts and trekkers. The town is also known for its annual Behdienkhlam festival, which showcases the rich cultural traditions of the Jaintia tribe. Visitors can explore nearby attractions like Thadlaskein Lake and Syntu Ksiar, a sacred forest. Jowai offers a peaceful retreat in the lap of Meghalaya's natural beauty.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.trawell.in%2Fmeghalaya%2Fjowai&psig=AOvVaw1VxAJavFzFDBCn9_j-VmjS&ust=1695491861961000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCIj2z8blvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data30)

// Now, the ArrayList contains data for all the destinations with the provided links
// Create and add data for the thirty-first destination
        // Create and add data for the thirty-first destination
        val data31 = PopularDestinationModel(
            "Madurai",
            "Madurai, also known as the 'City of Temples,' is one of the oldest cities in India and a cultural treasure trove. It is located in the southern state of Tamil Nadu and is famous for the majestic Meenakshi Amman Temple, an architectural marvel that attracts devotees and tourists from around the world. Madurai is steeped in history and boasts a rich cultural heritage. Visitors can explore its bustling markets, taste delicious South Indian cuisine, and witness vibrant festivals. The city's ancient temples, historical sites, and vibrant atmosphere make it a must-visit destination in Tamil Nadu.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tourmyindia.com%2Fstates%2Ftamilnadu%2Fmadurai.html&psig=AOvVaw33UhkMfCudTPzAPfWIKtQz&ust=1695492004936000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCIi2yIfmvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data31)

// Create and add data for the thirty-second destination
        val data32 = PopularDestinationModel(
            "Ooty",
            "Ooty, officially known as Udagamandalam, is a charming hill station located in the Nilgiri Hills of Tamil Nadu. It is renowned for its lush tea gardens, pleasant climate, and scenic beauty. Ooty is a popular destination for honeymooners and nature enthusiasts. The town offers opportunities for trekking, boating in Ooty Lake, and exploring the Nilgiri Mountain Railway, a UNESCO World Heritage Site. The Botanical Gardens and Rose Garden are other attractions that showcase the region's rich flora. Ooty is a tranquil getaway amidst the picturesque landscapes of South India.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tamilnadutourisminfo.com%2Footy%2F&psig=AOvVaw2Ev-YK-3Dor-MM_0V3q7K_&ust=1695492076327000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCMDjrqnmvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data32)

// Create and add data for the thirty-third destination
        val data33 = PopularDestinationModel(
            "Coonoor",
            "Coonoor, nestled in the Nilgiri Hills of Tamil Nadu, is a picturesque hill station known for its tranquil ambiance and lush greenery. It is a perfect destination for those seeking a peaceful retreat away from the hustle and bustle of city life. Coonoor offers breathtaking views of tea estates, waterfalls, and rolling hills. Sim's Park, a botanical garden, and Lamb's Rock, a viewpoint, are popular attractions. The town is also famous for its Nilgiri tea. Coonoor is an ideal destination for nature lovers and birdwatchers.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FCoonoor&psig=AOvVaw3wKXqS687X_X4OYBTIP-S7&ust=1695492148824000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCJic78vmvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data33)

// Create and add data for the thirty-fourth destination
        val data34 = PopularDestinationModel(
            "Vellore",
            "Vellore, located in the Indian state of Tamil Nadu, is a city steeped in history and known for its cultural heritage. The city is home to the impressive Vellore Fort, a 16th-century fortification built by the Vijayanagara Empire. The fort houses several historical structures, including the Jalakandeswarar Temple and the Vellore Government Museum. Vellore is also famous for its medical institutions, including Christian Medical College (CMC). The city offers a blend of historical significance and modern advancements, making it a unique destination for travelers.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tamilnadutourism.tn.gov.in%2Fdestinations%2Fvellore-district&psig=AOvVaw1H98hnoJh7WYhzfRcenysx&ust=1695492212602000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCIDQrermvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data34)

// Create and add data for the thirty-fifth destination
        val data35 = PopularDestinationModel(
            "Chennai",
            "Chennai, the capital city of Tamil Nadu, is a vibrant metropolis known for its rich culture, historical landmarks, and beautiful beaches. It is a bustling hub of commerce, art, and education. Marina Beach, one of the longest urban beaches in the world, is a popular attraction. Chennai is also home to iconic sites like Kapaleeshwarar Temple, Fort St. George, and the Government Museum. The city's traditional music and dance forms, including Bharatanatyam and Carnatic music, are an integral part of its culture. Chennai offers a unique blend of tradition and modernity.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FChennai&psig=AOvVaw3d3gL1IO5hD1WmoTednp-t&ust=1695492267077000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCKCLqoTnvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data35)

// Create and add data for the thirty-sixth destination
        val data36 = PopularDestinationModel(
            "Faridabad",
            "Faridabad, a city in the northern Indian state of Haryana, is known for its industrial and commercial significance. It is a part of the National Capital Region (NCR) and is situated close to New Delhi. Faridabad has witnessed rapid urbanization and offers various attractions, including Badkhal Lake, Surajkund, and Nahar Singh Palace. The city is known for its manufacturing units and educational institutions. Faridabad serves as an important economic and cultural center in the region.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FFaridabad&psig=AOvVaw39bm6_IUF8ia0QfT0UzQDJ&ust=1695492420356000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCOCgqs7nvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data36)

// Create and add data for the thirty-seventh destination
        val data37 = PopularDestinationModel(
            "Gurugram",
            "Gurugram, also known as Gurgaon, is a thriving city located in the Indian state of Haryana. It is part of the National Capital Region (NCR) and has witnessed rapid urbanization and development in recent years. Gurugram is known for its modern infrastructure, corporate offices, and upscale malls. The city offers a vibrant nightlife, numerous dining options, and cultural events. Cyber Hub and Kingdom of Dreams are popular entertainment destinations. Gurugram is a prominent hub for information technology and business in India.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fm.economictimes.com%2Ftech%2Finformation-tech%2Fharyana-job-reservation-law-may-trigger-it-exodus-from-gurugram%2Farticleshow%2F81321676.cms&psig=AOvVaw0UMrYKU1ezBVxsC_Nebei8&ust=1695492542197000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCLiQ54fovoEDFQAAAAAdAAAAABAE"
        )
        list.add(data37)

// Create and add data for the thirty-eighth destination
        val data38 = PopularDestinationModel(
            "Karnal",
            "Karnal, a city in the Indian state of Haryana, is known for its historical and cultural significance. It is famous for the Karnal Fort, an ancient structure built during the Mughal era. The city also offers attractions like the Karnal Lake and the Kalpana Chawla Memorial Planetarium, dedicated to the renowned astronaut. Karnal is known for its agricultural research institutions and is an important center for the production of rice and wheat. The city provides a glimpse into Haryana's history and agricultural heritage.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.karnalonline.in%2Fcity-guide%2Fkarnal-tourism&psig=AOvVaw2V41LSBXFvDb8xYVNuFcVk&ust=1695492604416000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCODEk6XovoEDFQAAAAAdAAAAABAE"
        )
        list.add(data38)

// Create and add data for the thirty-ninth destination
        val data39 = PopularDestinationModel(
            "Morni",
            "Morni is a quaint hill station located in the Panchkula district of Haryana. It is known for its serene landscapes, lush forests, and the Morni Hills. The town offers opportunities for trekking, nature walks, and birdwatching. Morni is home to the Morni Fort, an ancient structure with historical significance. Visitors can enjoy the scenic beauty of the Tikkar Taal Lake and explore the charming villages around Morni. It is a peaceful destination for those seeking a getaway amidst nature.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.holidify.com%2Fplaces%2Fpanchkula%2Fmorni-hills-sightseeing-3174.html&psig=AOvVaw10TcITOCvleG5XZUP9kNzr&ust=1695492654875000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCPCEpL3ovoEDFQAAAAAdAAAAABAE"
        )
        list.add(data39)

// Create and add data for the fortieth destination
        val data40 = PopularDestinationModel(
            "Rohtak",
            "Rohtak, a city in the Indian state of Haryana, is known for its historical and cultural heritage. The city has several historical sites, including the Tilyar Lake, which offers boating and recreational activities. Rohtak is also famous for educational institutions like Maharshi Dayanand University. The city's vibrant culture and lively markets make it an interesting destination for travelers. Rohtak is known for its contributions to sports, especially wrestling, and hosts various tournaments and events.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FRohtak&psig=AOvVaw3N_rvXoMhIPdt5GrE_hRgW&ust=1695492721871000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCPDqn93ovoEDFQAAAAAdAAAAABAE"
        )
        list.add(data40)


// Now, the ArrayList contains data for all the destinations with the provided links
// Create and add data for the forty-first destination
        // Create and add data for the forty-first destination
        val data41 = PopularDestinationModel(
            "Kangla Fort",
            "Kangla Fort is a historic site in Imphal, Manipur, with a rich heritage dating back centuries. It holds immense cultural and archaeological significance. The fort was the ancient seat of the Manipur Kingdom and is known for its temples, museums, and artifacts. Kangla Fort is a must-visit destination for history enthusiasts and those interested in exploring Manipur's cultural heritage.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tourmyindia.com%2Fstates%2Fmanipur%2Fkangla-fort.html&psig=AOvVaw16Ouq1K5H4TagfgZNmv2jA&ust=1695492838746000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCMjuhZXpvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data41)

// Create and add data for the forty-second destination
        val data42 = PopularDestinationModel(
            "Imphal",
            "Imphal is the capital city of the northeastern state of Manipur in India. It is known for its scenic landscapes, lush greenery, and cultural heritage. Imphal offers attractions like the Kangla Fort, Loktak Lake, Shree Govindajee Temple, and the unique women-only Ima Keithel (Mother's Market). The city is also famous for its traditional Manipuri dance forms and martial arts. Imphal is a gateway to exploring the natural beauty and culture of Manipur.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FImphal&psig=AOvVaw0xy2vykiWWSinzVD3TzgQI&ust=1695492902583000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCNjLpLPpvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data42)

// Create and add data for the forty-third destination
        val data43 = PopularDestinationModel(
            "Ukhrul",
            "Ukhrul is a picturesque town in the Indian state of Manipur, known for its scenic beauty and cultural diversity. It is home to the Tangkhul Naga tribe and offers a glimpse into their traditions and way of life. Ukhrul is surrounded by lush green hills, making it an ideal destination for nature lovers and trekkers. The town is famous for the Shirui Lily, a rare and beautiful flower that blooms on the Shirui Peak. Visitors can explore the serene landscapes and interact with the local communities.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FUkhrul&psig=AOvVaw1XZCAF5TweZFLEePgo-zOb&ust=1695492971327000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCLC2hNTpvoEDFQAAAAAdAAAAABAJ"
        )
        list.add(data43)

// Create and add data for the forty-fourth destination
        val data44 = PopularDestinationModel(
            "Thoubal",
            "Thoubal is a town in Manipur, India, known for its natural beauty and cultural attractions. It is situated in the Thoubal district and offers scenic views of hills, lakes, and paddy fields. Thoubal is home to the Ikop Lake, which is a popular boating and picnic spot. The town is also known for its unique traditional huts and handicrafts. Visitors can explore the local culture, enjoy the serene surroundings, and indulge in outdoor activities like boating and hiking.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FThoubal&psig=AOvVaw3ASPh4X81_vUXXSHL54PNG&ust=1695493037941000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCOCh-fPpvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data44)

// Create and add data for the forty-fifth destination
        val data45 = PopularDestinationModel(
            "Chandel",
            "Chandel is a district in Manipur, known for its natural beauty and cultural diversity. The district is home to various indigenous communities and offers a unique blend of traditions. Chandel is surrounded by hills and forests, making it an excellent destination for nature enthusiasts and trekkers. It is also known for its historical sites, including ancient temples and stone monuments. Chandel provides a peaceful and offbeat travel experience in the northeastern region of India.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.holidify.com%2Fplaces%2Fchandel%2F&psig=AOvVaw3YZKioQczwyQvK15Z7IiBs&ust=1695493092549000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCOilio7qvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data45)


// Now, the ArrayList contains data for all the destinations with the provided links
// Create and add data for the forty-sixth destination
        // Create and add data for the forty-sixth destination
        val data46 = PopularDestinationModel(
            "Dassam Falls",
            "Dassam Falls, also known as Dassam Ghagh, is a magnificent waterfall located near Ranchi, Jharkhand. It is one of the most popular tourist attractions in the region and is known for its natural beauty. The waterfall cascades down from a height of approximately 44 meters and is surrounded by lush greenery, making it an ideal spot for nature lovers and photographers. Visitors can enjoy the serene ambiance and cool waters of Dassam Falls.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FDassam_Falls&psig=AOvVaw01wpaJmG0JCc41CqgJ1l39&ust=1695493262044000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCLjC497qvoEDFQAAAAAdAAAAABAJ"
        )
        list.add(data46)

// Create and add data for the forty-seventh destination
        val data47 = PopularDestinationModel(
            "Jonha Falls",
            "Jonha Falls, also known as Gautamdhara Falls, is a mesmerizing waterfall located near Ranchi, Jharkhand. The waterfall is surrounded by dense forests and offers a tranquil escape from the city's hustle and bustle. Jonha Falls is named after Lord Buddha and is considered a sacred site. Visitors can enjoy the scenic beauty, take a dip in the natural pool formed by the waterfall, and explore the peaceful surroundings.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FJonha_Falls&psig=AOvVaw2uFe-bpPkB8Hktxnv_uXWs&ust=1695493371375000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCICw7JLrvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data47)

// Create and add data for the forty-eighth destination
        val data48 = PopularDestinationModel(
            "Jamshedpur",
            "Jamshedpur is a vibrant industrial city located in the Indian state of Jharkhand. It is known for its well-planned layout, green spaces, and modern infrastructure. The city is home to Tata Steel, one of India's largest steel manufacturing companies. Jamshedpur offers attractions like Jubilee Park, Tata Steel Zoological Park, and the scenic Dimna Lake. The city combines industrial progress with natural beauty, making it an interesting destination for both business travelers and tourists.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FJamshedpur&psig=AOvVaw1oj_TGnCNtEAB-XNRkzXvX&ust=1695493442815000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCIC5gLXrvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data48)

// Create and add data for the forty-ninth destination
        val data49 = PopularDestinationModel(
            "Jubilee Park",
            "Jubilee Park is a beautiful urban park located in Jamshedpur, Jharkhand. It is known for its lush green lawns, colorful flowerbeds, and serene ambiance. The park features a Mughal Garden, a zoo, fountains, and a lake with boating facilities. Jubilee Park is a popular recreational spot for families and nature enthusiasts. It offers a peaceful retreat in the heart of the city.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.myvisitinghours.org%2Fjubilee-park-413&psig=AOvVaw1LU-Lyfhf1wP15rFZ28Pbw&ust=1695493531845000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCMic1N_rvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data49)

// Create and add data for the fiftieth destination
        val data50 = PopularDestinationModel(
            "Ranchi",
            "Ranchi, the capital of Jharkhand, is a city known for its natural beauty and cultural heritage. It is surrounded by hills, forests, and waterfalls, making it a paradise for nature lovers. Ranchi offers attractions like Rock Garden, Tagore Hill, and Kanke Dam. The city is also famous for its tribal culture and traditions. Ranchi provides a blend of modernity and nature's charm, making it a unique destination in eastern India.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.livemint.com%2Fnews%2Findia%2Fwhy-ranchi-symbolizes-india-s-unmet-hopes-11577381730765.html&psig=AOvVaw1J-gtSNydfX0VQIq1tX0YI&ust=1695493574673000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCNCs8_PrvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data50)

// Now, the ArrayList contains data for all the destinations with the provided links
// Create and add data for the fifty-first destination
        // Create and add data for the fifty-first destination
        val data51 = PopularDestinationModel(
            "Manali",
            "Manali, situated in Himachal Pradesh, is a popular hill station known for its breathtaking landscapes and adventurous activities. It is nestled in the Pir Panjal range of the Himalayas and offers views of snow-capped mountains and lush green valleys. Manali is a year-round destination and is famous for activities like trekking, skiing, paragliding, and exploring ancient temples. The town's vibrant culture and scenic beauty make it a favorite among tourists.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FManali%2C_Himachal_Pradesh&psig=AOvVaw1XUZSDSM39BZxybjZGS7qI&ust=1695493772207000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCPjHi9LsvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data51)

// Create and add data for the fifty-second destination
        val data52 = PopularDestinationModel(
            "Shimla",
            "Shimla, the capital of Himachal Pradesh, is a charming hill station known for its colonial architecture, scenic beauty, and pleasant climate. It offers attractions like the Mall Road, Ridge, and Jakhu Temple. Shimla is surrounded by lush forests and snow-capped peaks, making it a popular destination for honeymooners and nature enthusiasts. The toy train ride from Kalka to Shimla is a unique experience for tourists.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tripiwiki.com%2FHimachal-Pradesh%2FShimla-Attractions&psig=AOvVaw16dRuaYjt_s5iuJ7arnqZ2&ust=1695493863715000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCKib5P3svoEDFQAAAAAdAAAAABAI"
        )
        list.add(data52)

// Create and add data for the fifty-third destination
        val data53 = PopularDestinationModel(
            "Dalhousie",
            "Dalhousie, located in Himachal Pradesh, is a serene hill station known for its colonial architecture and scenic landscapes. It offers attractions like Khajjiar, Panchpula, and the Kalatop Wildlife Sanctuary. Dalhousie is a perfect destination for a peaceful getaway and is surrounded by dense forests and picturesque valleys. The town's old-world charm and tranquility make it a favorite among tourists.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tourmyindia.com%2Fstates%2Fhimachal%2Fdalhousie.html&psig=AOvVaw11b7t2CcK_hBH6lx5zz5jI&ust=1695493918536000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCNib5JftvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data53)

// Create and add data for the fifty-fourth destination
        val data54 = PopularDestinationModel(
            "Kasauli",
            "Kasauli, a small hill station in Himachal Pradesh, is known for its tranquil ambiance and scenic beauty. It offers attractions like Monkey Point, Christ Church, and Kasauli Brewery. Kasauli is an ideal destination for those seeking solitude and a break from city life. The town's lush greenery and pleasant climate make it a perfect place for a relaxed vacation.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tourmyindia.com%2Fblog%2Fbest-places-visit-kasauli-himachal%2F&psig=AOvVaw1i-bBa5mlpsZ_YQr_5DfjV&ust=1695493974695000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCODe3bLtvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data54)

// Create and add data for the fifty-fifth destination
        val data55 = PopularDestinationModel(
            "Spiti Valley",
            "Spiti Valley, located in Himachal Pradesh, is a remote and breathtakingly beautiful region in the Himalayas. It offers attractions like Key Monastery, Chandratal Lake, and Pin Valley National Park. Spiti is known for its stark landscapes, high-altitude villages, and Tibetan Buddhist culture. It's a paradise for adventure seekers and nature lovers, offering treks, wildlife spotting, and a chance to experience the unique culture of the region.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FSpiti&psig=AOvVaw1kOrXdqRB77fwXEE3KsLlU&ust=1695494039630000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCLiH2dHtvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data55)


// Now, the ArrayList contains data for all the destinations with the provided links
// Create and add data for the fifty-sixth destination
        // Create and add data for the fifty-sixth destination
        val data56 = PopularDestinationModel(
            "Aizawl",
            "Aizawl is the capital of the Indian state of Mizoram, known for its scenic beauty and rich cultural heritage.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FAizawl&psig=AOvVaw25rC6MIf0AnQSQe_uB_iee&ust=1695494687700000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCMCVy4rwvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data56)

// Create and add data for the fifty-seventh destination
        val data57 = PopularDestinationModel(
            "Tam Dil",
            "Tam Dil is a picturesque lake in Mizoram, offering tranquility and natural beauty to visitors.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FTam_Dil&psig=AOvVaw1KstYu4Crdrmi2R2FI-GYL&ust=1695494840167000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCPiro8_wvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data57)

// Create and add data for the fifty-eighth destination
        val data58 = PopularDestinationModel(
            "Lunglei",
            "Lunglei is a town in Mizoram known for its natural beauty and vibrant local culture.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FLunglei&psig=AOvVaw2CNWZ0amTif9CzN7be-WCD&ust=1695495066434000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCJiWu7zxvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data58)

// Create and add data for the fifty-ninth destination
        val data59 = PopularDestinationModel(
            "Champhai",
            "Champhai is a town in Mizoram known for its scenic landscapes and rich cultural heritage.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FChamphai&psig=AOvVaw3IPRF-Csc0SRcGbqgq7Hnm&ust=1695495106331000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCKi_uM_xvoEDFQAAAAAdAAAAABAE"
        )
        list.add(data59)

// Create and add data for the sixtieth destination
        val data60 = PopularDestinationModel(
            "Kolasib",
            "Kolasib is a town in Mizoram known for its natural beauty and warm hospitality.",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FKolasib&psig=AOvVaw2A1SRFDRGvYceUMxiZptrW&ust=1695495310753000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCKi656_yvoEDFQAAAAAdAAAAABAH"
        )
        list.add(data60)

        val data61 = PopularDestinationModel(
            "Taj Mahal",
            "The Taj Mahal is an iconic symbol of love and one of the most famous landmarks in India.",
            "https://upload.wikimedia.org/wikipedia/commons/b/bd/Taj_Mahal%2C_Agra%2C_India_edit3.jpg"
        )
        list.add(data61)

        val data62 = PopularDestinationModel(
            "Varanasi",
            "Varanasi, one of the oldest continuously inhabited cities in the world, is a sacred and spiritual hub on the banks of the Ganges River.",
            "https://lh5.googleusercontent.com/p/AF1QipNo6QlQcmpN0LaQKsXK3IuVnNJQ0e-iESxzVdpg=w540-h312-n-k-no"
        )
        list.add(data62)

        val data63 = PopularDestinationModel(
            "Ayodhya",
            "Ayodhya, located in Uttar Pradesh, is renowned as the birthplace of Lord Rama and holds immense religious significance.",
            "https://encrypted-tbn1.gstatic.com/licensed-image?q=tbn:ANd9GcS7qX77NO-rnZmeRm3T3zQ-5wslcFqbaYDHZZn-DxewBl2vvBGTs4O_GZUfSw17qEJnTJZD_xdTszWJOWJfXJIp3oUXOstu"
        )
        list.add(data63)
        val data65 = PopularDestinationModel(
            "Prayagraj",
            "Prayagraj, formerly known as Allahabad, is a sacred city in Uttar Pradesh, India, where the confluence of the Ganges, Yamuna, and mythical Saraswati rivers takes place, hosting the revered Kumbh Mela.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcSFaKe83aVeeJfHYDkje5J0vpcClc39hV2h85o-Putxdgyd01YuotMRs8kDKpGRZBtoqzjiPPRdElyedy5Oy6tnfuq-9fGl"
        )
        list.add(data65)
        val data64 = PopularDestinationModel(
            "Fatehpur Sikri",
            "Fatehpur Sikri, a UNESCO World Heritage site in Uttar Pradesh, is an architectural marvel and former Mughal capital known for its stunning red sandstone buildings.",
            "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcQZwvLH2FcVZWLX5SEyHbLYQ8riuCCLEU-DZmrDNPJOXR74bvNoD8x5aKixVedH3c62v3CXWWGwwRlzHI404iCMAhdtWD9J"
        )
        list.add(data64)

        // Create and add data for the first popular place in Rajasthan
        val data66 = PopularDestinationModel(
            "Jaipur",
            "Jaipur, known as the 'Pink City,' is the capital of Rajasthan and famous for its magnificent palaces, historic forts, and vibrant culture.",
            "https://lh5.googleusercontent.com/p/AF1QipPvRLMbvf0so_nFsawhu_CnVceeNcM3RL1Eu-lH=w540-h312-n-k-no" // Replace with the actual image link for Jaipur
        )
        list.add(data66)

// Create and add data for the second popular place in Rajasthan
        val data67 = PopularDestinationModel(
            "Udaipur",
            "Udaipur, often called the 'City of Lakes,' is known for its beautiful lakes, stunning palaces, and romantic ambiance.",
            "https://lh5.googleusercontent.com/p/AF1QipOFgr0wxXT3ZTLKrEWikuNUASl9e1xhNRymcmKa=w540-h312-n-k-no" // Replace with the actual image link for Udaipur
        )
        list.add(data67)

// Create and add data for the third popular place in Rajasthan
        val data68 = PopularDestinationModel(
            "Jaisalmer",
            "Jaisalmer, the 'Golden City,' is famous for its golden sand dunes, ancient forts, and unique desert experiences.",
            "https://lh5.googleusercontent.com/p/AF1QipN2mKPLSvVY-PK2NzwAqpLoemJy37bajMku5Dwh=w540-h312-n-k-no" // Replace with the actual image link for Jaisalmer
        )
        list.add(data68)

// Create and add data for the fourth popular place in Rajasthan
        val data69 = PopularDestinationModel(
            "Jodhpur",
            "Jodhpur, known as the 'Blue City,' is renowned for its blue-painted houses, majestic forts, and rich heritage.",
            "https://lh5.googleusercontent.com/p/AF1QipPpRNDOEf-7-_zqruf8kxNx-rVg-81bEkiVjskt=w540-h312-n-k-no" // Replace with the actual image link for Jodhpur
        )
        list.add(data69)

// Create and add data for the fifth popular place in Rajasthan
        val data70 = PopularDestinationModel(
            "Pushkar",
            "Pushkar, a sacred town, is famous for its Brahma Temple, holy Pushkar Lake, and the annual Pushkar Camel Fair.",
            "https://lh5.googleusercontent.com/p/AF1QipNrl_tJ2L2BL1F6QoldcNDc9xjQ8_m0_K99bN2C=w540-h312-n-k-no" // Replace with the actual image link for Pushkar
        )
        list.add(data70)



// Now, the ArrayList contains data for all the destinations with the provided links
    return list
    }
}