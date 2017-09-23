package meklit.apostolic.apostolicdoctrine;

/**
 * Created by Menasi on 9/21/2017.
 */

public class Lang {
    private String LANG_ID;
    private String LANG_AMH;
    private String LANG_ENG;

    public Lang(String LANG_ID, String LANG_AMH, String LANG_ENG) {
        this.LANG_ID = LANG_ID;
        this.LANG_AMH = LANG_AMH;
        this.LANG_ENG = LANG_ENG;
    }

    public String getLANG_ID() {
        return LANG_ID;
    }

    public String getLANG_AMH() {
        return LANG_AMH;
    }

    public String getLANG_ENG() {
        return LANG_ENG;
    }

    public static Lang [] langs ={

            new Lang("Mod1TitleGOD", "እግዚአብሔር", "GOD"),
            new Lang("Mod2TitleBible", "መፅሐፍ ቅዱስ", "The Bible"),
            new Lang("Mod3TitleFaith", "እምነት", "Faith"),
            new Lang("Mod4TitleHope", "ተስፋ", "Hope"),
            new Lang("Mod1Less1TitleWhoISGOD", "እግዚአብሔር ማነው?", "Who is God?"),
            new Lang("Mod1Less1String", "ሁሉም ሰዎች አንድ አሁን የሚታየውን ሁሉ የፈጠረ ማንነት እንዳለ ይስማማሉ። እግዚአብሔር ሁሉን ማድረግ የሚችል በሁሉ ቦታ የሚገኝ ሁሉን የሚያውቅ አምላክ ነው። እግዚአብሔር እኛን በመለክ እና አምሳሉ ፈጥሮናል።", "Almost all people agree upon a supernatural being that willed everything that we see now into existence. God is this omnipotent, omnipresent and all knowing supernatural being. God created us in his likeness and image."),
            new Lang("Mod1Less2TitleGODidSprirt", " እግዚአብሔር መንፈስ ነው።", "God is Spirit"),
            new Lang("Mod1Less2String", "እግዚአብሔር የሚታይ ሆነ የሚዳሰስ ቅርፅ የለውም በዚህም ምክንያት ማንም ሰው አይቶት አያውቅም $1stjn4:12$ እግዚአብሔር በቦታ ፈፅሞ ሊወሰን ወይም ሊለካ አይችልም $1stkng8:12,13$  $Jobs11$ ;$Jer23:23$ ; $Ps139:7-10$ ; $Is66:1$", "God does not possess a visible form that can be seen or touched which would consequently mean that no man has ever seen him $1stjn4:12$. He cannot be held or measured by places $1stkng8:12,13$  $Jobs11$ ;$Jer23:23$ ; $Ps139:7-10$ ; $Is66:1$ "),
            new Lang("Mod1Less3TitleGODIsWord", " እግዚአብሔር ቃል ነው", " God is word"),
            new Lang("Mod1Less3String", "እግዚአብሔር ቃል ነው ስንል እግዚአብሔር ከእኛ ጋር የሚነጋገረው በቃሉ በኩል ስለሆነ ነው። እግዚአብሔር የሚለይበት መለያው ቃሉ ነው $jn1:1$። የእግዚአብሔር ቃል ከእግዚአብሔር እየወጣ የእርሱን ፈቃድ የሚፈፅም ሲሆን ስራውን ሲያጠናቅቅ ወደ እግዚአብሔር ይመለሳል $is55:11$", "What we mean by God is word, is that God communicates with us through his word. His main identifying characteristic is his word $jn1:1$. His word is a part of him that comes out does his bidding and goes back to him $is55:11$. "),
            new Lang("Mod1Less4TitleGODRightHand", "የእግዚአብሔር ቀኝ", "God's right hand"),
            new Lang("Mod1Less4String", "የእግዚአብሔር ክንድ ወይም ቀኝ ተበሎ ብዙ ጊዜ ሚጠቀሰው የእግዚአብሔር ቃል ነው $is53$። የእግዚአብሔር ቃል ፣በሆለኛው ዘመን ስጋ የሚሆነው፣ በእርሱ ሰማያት እና ምድር ተፈጥረዋል $hb1:2$ $ps107:20$", "God's strength or also usually referred to as his right hand is his word $is53$. This word of God which later will wear flesh is what created the heaven, the earth and everything in it $hb1:2$ $ps107:20$ "),
            new Lang("Is66:1Display", "ትንቢተ ኢሳይያስ 66", "Isa 66"),
            new Lang("Is66:1String", "እግዚአብሔር እንዲህ ይላል፦ ሰማይ ዙፋኔ ነው፥ ምድርም የእግሬ መረገጫ ናት፤ የምትሠሩልኝ ቤት ምን ዓይነት ነው? የማርፍበትስ ስፍራ ምንድር ነው?", "Thus saith the Lord, The heaven is my throne, and the earth is my footstool: where is the house that ye build unto me? and where is the place of my rest?"),
            new Lang("Ps139:7-10Display", "መዝሙረ ዳዊት 139: 7 -10", "Ps 139: 7 -10"),
            new Lang("Ps139:7-10String", "ከመንፈስህ ወዴት እሄዳለሁ? ከፊትህስ ወዴት እሸሻለሁ? ወደ ሰማይ ብወጣ፥ አንተ በዚያ ነህ፤ ወደ ሲኦልም ብወርድ፥ በዚያ አለህ። እንደ ንስር የንጋትን ክንፍ ብወስድ፥ እስከ ባሕር መጨረሻም ብበርር፥ ", "Whither shall I go from thy spirit? or whither shall I flee from thy presence? If I ascend up into heaven, thou art there: if I make my bed in hell, behold, thou art there. If I take the wings of the morning, and dwell in the uttermost parts of the sea; "),
            new Lang("Jobs11Display", "መጽሐፈ ኢዮብ 11:7", "Job 11:7"),
            new Lang("Jobs11String", "የእግዚአብሔርን ጥልቅ ነገር ልትመረምር ትችላለህን? ወይስ ሁሉን የሚችል አምላክ ፈጽመህ ልትመረምር ትችላለህን? ከሰማይ ይልቅ ከፍ ይላል፤ ምን ልታደርግ ትችላለህ? ከሲኦልም ይልቅ ይጠልቃል፤ ምን ልታውቅ ትችላለህ? ርዝመቱ ከምድር ይልቅ ይረዝማል፥ ከባሕርም ይልቅ ይሰፋል። ", " Canst thou by searching find out God? canst thou find out the Almighty unto perfection? It is as high as heaven; what canst thou do? deeper than hell; what canst thou know? The measure thereof is longer than the earth, and broader than the sea. "),
            new Lang("1stkng8:12,13Display", "መጽሐፈ ነገሥት ቀዳማዊ 8:12,13", "1Kgs 8:12,13"),
            new Lang("1stkng8:12,13String", "ሰሎሞንም፦ እግዚአብሔር፦ በጨለማው ውስጥ እኖራለሁ ብሎአል፤ እኔም ለዘላለም የምትኖርበት ማደሪያ ቤት በእውነት ሠራሁልህ አለ።", "Then spake Solomon, The Lord said that he would dwell in the thick darkness. I have surely built thee an house to dwell in, a settled place for thee to abide in for ever. "),
            new Lang("jn1:1Display", "የዮሐንስ ወንጌል 1:1", "John 1:1"),
            new Lang("jn1:1String", "በመጀመሪያው ቃል ነበረ፥ ቃልም በእግዚአብሔር ዘንድ ነበረ፥ ቃልም እግዚአብሔር ነበረ።", "n the beginning was the Word, and the Word was with God, and the Word was God."),
            new Lang("hb1:2Display", "ወደ ዕብራውያን 1:2", "Heb 1:2"),
            new Lang("hb1:2String", "ሁሉን ወራሽ ባደረገው ደግሞም ዓለማትን በፈጠረበት በልጁ በዚህ ዘመን መጨረሻ ለእኛ ተናገረን", "Hath in these last days spoken unto us by his Son, whom he hath appointed heir of all things, by whom also he made the worlds;"),
            new Lang("is53Display", "ትንቢተ ኢሳይያስ 53", "Isa 53"),
            new Lang("is53String", "የሰማነውን ነገር ማን አምኖአል? የእግዚአብሔርስ ክንድ ለማን ተገልጦአል?", "Who hath believed our report? and to whom is the arm of the Lord revealed?"),
            new Lang("ps107:20Display", "መዝሙረ ዳዊት 107:20", "Ps 107:20"),
            new Lang("ps107:20String", "ቃሉን ላከ ፈወሳቸውም፥ ከጥፋታቸውም አዳናቸው።", "He sent his word, and healed them, and delivered them from their destructions."),
            new Lang("1stjn4:12Display", "1ኛ የዮሐንስ መልእክት 4:12", "1John 4:12"),
            new Lang("1stjn4:12String", "እግዚአብሔርን ማንም ከቶ አላየውም፤ እርስ በርሳችን ብንዋደድ እግዚአብሔር በእኛ ይኖራል ፍቅሩም በእኛ ፍጹም ሆኖአል።", "No man hath seen God at any time. If we love one another, God dwelleth in us, and his love is perfected in us."),
            new Lang("is55:11Display", "ትንቢተ ኢሳይያስ 55:11", "Isa 55:11"),
            new Lang("is55:11String", "ከአፌ የሚወጣ ቃሌ እንዲሁ ይሆናል፤ የምሻውን ያደርጋል የላክሁትንም ይፈጽማል እንጂ ወደ እኔ በከንቱ አይመለስም።", "So shall my word be that goeth forth out of my mouth: it shall not return unto me void, but it shall accomplish that which I please, and it shall prosper in the thing whereto I sent it."),
            new Lang("Jer23:23Display", "ትንቢተ ኤርምያስ 23:23", "Jer 23:23"),
            new Lang("Jer23:23String", "እኔ የቅርብ አምላክ ነኝ እንጂ የሩቅ አምላክ አይደለሁም።", "Am I a God at hand, saith the Lord, and not a God afar off?"),
            new Lang("Mod2Less1TitlewhatIsBible", "መፅሐፍ ቅዱስ ምንድን ነው?", "What is Bible?"),
            new Lang("Mod2Less1String", "መፅሐፍ ቅዱስ በመንፈስ ተመርተው በተለያዩ ዘመናት የእግዚአብሔር ነብያት እና ሐዋርያት የፃፉት የእግዚአብሔር ቃል ነው $1stpt1:11$", "The bible is the written word of God throughout history which the prophets and apostles wrote while being led by the spirit of Christ $1stpt1:11$"),
            new Lang("Mod2Less2TitleOtandNt", "ብሉይ እና አዲስ ኪዳን", "The Old and New Testament"),
            new Lang("Mod2Less2String", "ብሉይ ኪዳን የእግዚአብሔርን ቃልኪዳን እና የተስፋ ቃል የያዘ የመፅሐፍ ቅዱስ ክፍል ነው ፤ ከክርስቶስ ልደት በፊት ይኖሩ የነበሩትን የሰዎችን አኖኖርንም ያሳየናል። የአዲስ ኪዳን ክፍል ደግሞ በመጀመሪያዎቹ ክፍሎቹ ስለ ክርስቶስ በስጋ በነበረበት ወቅት የነበረውን ህይወት ፣ ትምህርት ፣ ትንቢቶች እና የከፈለውን መስዋትነት ያሳዩናል ከዚህም በተጨማሪ በሐዋርያት እጆች የተፃፉ በርካታ ምልክቶችንም ይይዛል። የአዲስ ኪዳን የመጨረሻ መፅሀፍ ስለዚች አለም ማብቅያና ስለሚመጣው አለም መልክ የሚያሳይ የትንቢት መፅሀፍ ነው። በብዙ መልኩ ብሉይ ኪዳን የአዲስ ኪዳን ጥላ ነው ማለት ይቻላል።", "The old testament contains the promises and word of God; as well as the ways of the people before Christ was born. The New Testament refers first to the life of Christ on earth, his teachings, his messages and prophecies of the future. It also contains most of the writings of the apostles of Christ and finally the prophecy of the end of life on this earth. In this aspect we can see that the old testament of actually the shadow of the new testament."),
            new Lang("1stpt1:11Display", "1ኛ የጴጥሮስ መልእክት 1:11", "1Pet 1:11"),
            new Lang("1stpt1:11String", "በእነርሱም የነበረ የክርስቶስ መንፈስ፥ ስለ ክርስቶስ መከራ ከእርሱም በኋላ ስለሚመጣው ክብር አስቀድሞ እየመሰከረ፥ በምን ወይም እንዴት ባለ ዘመን እንዳመለከተ ይመረምሩ ነበር።", "Searching what, or what manner of time the Spirit of Christ which was in them did signify, when it testified beforehand the sufferings of Christ, and the glory that should follow."),


    };
}
