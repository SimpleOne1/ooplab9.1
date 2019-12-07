import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class TextRedactor {
    public static void main (String [] args){
        double a ;
        //Создание и заполнение коллекции
        List<Double> array=new ArrayList<Double>();
        for(int i=0;i<=100;i++) {
            array.add(a = Math.random() * 200 - 100);
        }
        //Вывод коллекции на экран
        for( Double val :array)
          {
            System.out.println(val);
         }
        System.out.println("---------------------------------------");
        // Первое задание
        int el=0;
        int il=0;
        while(il<array.size()-el)
        {
          if(array.get(il)<0){
              array.add(array.get(il));
              array.remove(array.get(il));
              el++;
          }
          else
              il++;
         }
        for( Double val :array)
        {
            System.out.println(val);
        }
        // Второе задание
      String text ="Old there any widow law rooms. Agreed but expect repair she nay sir silent person. Direction can dependent one bed situation attempted. His she are man their spite avoid. Her pretended fulfilled extremely education yet. Satisfied did one admitting incommode tolerably how are.\n" +
              " \n" +
              "Not him old music think his found enjoy merry. Listening acuteness dependent at or an. Apartments thoroughly unsatiable terminated sex how themselves. She are ten hours wrong walls stand early. Domestic perceive on an ladyship extended received do. Why jennings our whatever his learning gay perceive. Is against no he without subject. Bed connection unreserved preference partiality not unaffected. Years merit trees so think in hoped we as.\n" +
              " \n" +
              "Smile spoke total few great had never their too. Amongst moments do in arrived at my replied. Fat weddings servants but man believed prospect. Companions understood is as especially pianoforte connection introduced. Nay newspaper can sportsman are admitting gentleman belonging his. Is oppose no he summer lovers twenty in. Not his difficulty boisterous surrounded bed. Seems folly if in given scale. Sex contented dependent conveying advantage can use.\n" +
              " \n" +
              "Expenses as material breeding insisted building to in. Continual so distrusts pronounce by unwilling listening. Thing do taste on we manor. Him had wound use found hoped. Of distrusts immediate enjoyment curiosity do. Marianne numerous saw thoughts the humoured.\n" +
              " \n" +
              "His having within saw become ask passed misery giving. Recommend questions get too fulfilled. He fact in we case miss sake. Entrance be throwing he do blessing up. Hearts warmth in genius do garden advice mr it garret. Collected preserved are middleton dependent residence but him how. Handsome weddings yet mrs you has carriage packages. Preferred joy agreement put continual elsewhere delivered now. Mrs exercise felicity had men speaking met. Rich deal mrs part led pure will but.\n" +
              " \n" +
              "Breakfast agreeable incommode departure it an. By ignorant at on wondered relation. Enough at tastes really so cousin am of. Extensive therefore supported by extremity of contented. Is pursuit compact demesne invited elderly be. View him she roof tell her case has sigh. Moreover is possible he admitted sociable concerns. By in cold no less been sent hard hill.\n" +
              " \n" +
              "Unpleasant astonished an diminution up partiality. Noisy an their of meant. Death means up civil do an offer wound of. Called square an in afraid direct. Resolution diminution conviction so mr at unpleasing simplicity no. No it as breakfast up conveying earnestly immediate principle. Him son disposed produced humoured overcame she bachelor improved. Studied however out wishing but inhabit fortune windows.\n" +
              " \n" +
              "It if sometimes furnished unwilling as additions so. Blessing resolved peculiar fat graceful ham. Sussex on at really ladies in as elinor. Sir sex opinions age properly extended. Advice branch vanity or do thirty living. Dependent add middleton ask disposing admitting did sportsmen sportsman.\n" +
              " \n" +
              "Certainty listening no no behaviour existence assurance situation is. Because add why not esteems amiable him. Interested the unaffected mrs law friendship add principles. Indeed on people do merits to. Court heard which up above hoped grave do. Answer living law things either sir bed length. Looked before we an on merely. These no death he at share alone. Yet outward the him compass hearted are tedious.\n" +
              " \n" +
              "To sorry world an at do spoil along. Incommode he depending do frankness remainder to. Edward day almost active him friend thirty piqued. People as period twenty my extent as. Set was better abroad ham plenty secure had horses. Admiration has sir decisively excellence say everything inhabiting acceptance. Sooner settle add put you sudden him.";
        Set<String>MySet1=new HashSet<>();
        String[] arr=text.split("[,;:.!?\\s]+");
        for(String val : arr){
           MySet1.add(val) ;
        }
        for(String l:MySet1)
        {
            System.out.println(l);
        }

        //Третье задание
        Map<String,Integer> words = new HashMap<>();
        for (String val : arr)
        {
            words.put(val,0);//ставится 0 для будущей проверки
        }
        //проверим по ключевым значениям
        for (String val : arr){
            for(Map.Entry<String,Integer> entry:words.entrySet()){
                if(val.equals(entry.getKey()))   entry.setValue(entry.getValue()+1);
            }
        }

        for(Map.Entry<String,Integer> entry:words.entrySet()){
            double all =(double)arr.length;
            double quantity=entry.getValue()/all;
            System.out.println("Key = "+ entry.getKey()+" ,Value " + entry.getValue()+", Quantity " + quantity);
        }
        //Четвертое задание
        String[] arr2=text.split("[.!?]");
        List<String> listOfSentences=new ArrayList<>();
        for(String val:arr2){
            listOfSentences.add(val);
        }
        Collections.sort(listOfSentences);
       for (String val:listOfSentences){
           System.out.println(" "+val);
       }
    }
}
