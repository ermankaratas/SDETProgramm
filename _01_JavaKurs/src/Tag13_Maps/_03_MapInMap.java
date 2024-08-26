package Tag13_Maps;

import java.util.HashMap;

public class _03_MapInMap {
    public static void main(String[] args) {
        // Eine Anwendung für Visitenkarten für 2 Personen erstellen
        // Name, E-Mail, Telefon, Adresse
        // Diese Informationen sollen in einer einzigen Datenstruktur gespeichert werden

        // Visitenkarte für Zehra
        HashMap<String, String> ZKartVisitenkarte = new HashMap<>();
        ZKartVisitenkarte.put("name", "Zehra");
        ZKartVisitenkarte.put("email", "zehra@gmail.com");
        ZKartVisitenkarte.put("telefon", "0505676767");
        ZKartVisitenkarte.put("adresse", "Çekmeköy");

        System.out.println("ZKartVisitenkarte.get(name) = " + ZKartVisitenkarte.get("name"));
        System.out.println("ZKartVisitenkarte.get(email) = " + ZKartVisitenkarte.get("email"));

        // Visitenkarte für Esma
        HashMap<String, String> EKartVisitenkarte = new HashMap<>();
        EKartVisitenkarte.put("name", "Esma");
        EKartVisitenkarte.put("email", "esma@gmail.com");
        EKartVisitenkarte.put("telefon", "0505878787");
        EKartVisitenkarte.put("adresse", "Başakşehir");

        System.out.println("EKartVisitenkarte.get(name) = " + EKartVisitenkarte.get("name"));
        System.out.println("EKartVisitenkarte.get(email) = " + EKartVisitenkarte.get("email"));

        // Eine Datenstruktur zum Speichern der Visitenkarten erstellen
        HashMap<String, HashMap<String, String>> visitenkarten = new HashMap<>();
        // Die Schlüssel sind Strings zur Identifizierung der Personen, die Werte sind Visitenkarten (HashMaps)

        // Die Visitenkarten den Personen zuordnen
        visitenkarten.put("Zehra", ZKartVisitenkarte);    // Visitenkarte für Zehra
        visitenkarten.put("Esma", EKartVisitenkarte);     // Visitenkarte für Esma

        // E-Mail von Zehra ausgeben
        System.out.println("E-Mail von Zehra = " + visitenkarten.get("Zehra").get("email"));
        // Die gesamte Visitenkarte von Zehra ausgeben
        System.out.println("Visitenkarte von Zehra = " + visitenkarten.get("Zehra"));
    }
}
