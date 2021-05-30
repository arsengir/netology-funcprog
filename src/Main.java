import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "Aber jede Küche ist in erster Linie für Kochen bestimmt. Aus diesem Grund ist die Küche immer mit"
        + " den für Kochen notwendigen Sachen einem Waschbecken, einem Herd, einem Kühlschrank, einem Tisch etc. ausgerüstet."
        + "Wir alle haben in unseren Küchen auch andere kleine und grosse Küchenhelfer. Das können Mikrowellen,"
        + "Halogenöfen, Kaffemaschinen, Wasserkocher, Küchenmaschinen, Eierkocher, Allesschneider, Toaster,"
        + "Küchenwaagen, Fritteusen, Backautomate, Geschirrspülmaschinen und andere Küchengeräte.";

        List<String> dictionary = dictionaryGenerator(text);
        System.out.println("Словарь: ");
        dictionary.forEach(System.out::println);
    }

    private static List<String> dictionaryGenerator (String text){
        return Arrays.stream(text.replaceAll("\\p{Punct}","").split(" "))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
