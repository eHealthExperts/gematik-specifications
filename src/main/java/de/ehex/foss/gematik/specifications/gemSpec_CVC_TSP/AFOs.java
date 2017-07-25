package de.ehex.foss.gematik.specifications.gemSpec_CVC_TSP;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemSpec_CVC_TSP]}.
 *
 * @author Jonas Pfeiffer
 * @since May 10th, 2017
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2557("TIP1-A_2557", "Inhalt der Ausgabepolicy des TSP-CVC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2558("TIP1-A_2558", "Inhalt des Sicherheitskonzepts des TSP-CVC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2564("TIP1-A_2564", "Erzeugen von CV-Zertifikaten mit registrierten Zugriffsprofilen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2565("TIP1-A_2565", "Einholung von Qualifizierungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2566("TIP1-A_2566", "Nachweis über die Qualifizierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2568("TIP1-A_2568", "Erzeugen von CV-Zertifikaten mit Profilen, die einer Qualifizierung bedürfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2575("TIP1-A_2575", "Zugelassenes Zugriffsprofil im CV-Rollen-Zertifikat"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2578("TIP1-A_2578", "Korrekte ICCSN der Chipkarte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2579("TIP1-A_2579", "Korrekter privater Schlüssel in der Chipkarte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2580("TIP1-A_2580", "Erzeugung des privaten Schlüssels der Chipkarte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2581("TIP1-A_2581", "Evaluierung von HSMs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2582("TIP1-A_2582", "Vertraulichkeit des privaten Schlüssels der Chipkarte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2583("TIP1-A_2583", "Zuordnung des privaten Schlüssels zu Identitäten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2584("TIP1-A_2584", "Schlüsselpaare und CV-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2585("TIP1-A_2585", "Personalisierung von CV-Zertifikaten für einen HBA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2586("TIP1-A_2586", "Personalisierung von CV-Zertifikaten für ein Sicherheitsmodul vom Typ B"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2589("TIP1-A_2589", "Personalisierung des CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2590("TIP1-A_2590", "Vernichtung fehlerhafter Chipkarten vor deren Ausgabe"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2591("TIP1-A_2591", "Ausgabe fehlerfreier Chipkarten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2592("TIP1-A_2592", "Darstellung der Zusammenarbeit der beteiligten Akteure im Sicherheitskonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2593("TIP1-A_2593", "Schützenswerte Objekte des TSP-CVC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2594("TIP1-A_2594", "Vorgaben zum Schutzbedarf durch die gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2595("TIP1-A_2595", "Spezifische Erhöhung des Schutzbedarfs ist zulässig"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2596("TIP1-A_2596", "Schutzbedarf darf nicht erniedrigt werden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2598("TIP1-A_2598", "Verwendung des Schlüsselpaars der CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2599("TIP1-A_2599", "Begrenzung der Lebensdauer des Schlüsselpaars der CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2600("TIP1-A_2600", "Gültigkeitsdauer der CVC-CA Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2601("TIP1-A_2601", "Ablauf der Gültigkeitsdauer des privaten Schlüssels der CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2602("TIP1-A_2602", "Weiterverwendung des privaten Schlüssels einer CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2603("TIP1-A_2603", "Vernichtung nicht mehr benötigter Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2604("TIP1-A_2604", "Vernichtung der privaten Schlüssel bei Verlust der Zulassung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2605("TIP1-A_2605", "Maßnahmen zur Vernichtung von Schlüsseln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2606("TIP1-A_2606", "Information über die Vernichtung aller Schlüsselpaare an gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2607("TIP1-A_2607", "Einsatz eines HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2608("TIP1-A_2608", "Speicherung und Anwendung des privaten Schlüssels in einem HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2609("TIP1-A_2609", "Einsatz einer Chipkarte als HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2610("TIP1-A_2610", "Möglichkeit zum Klonen eines HSM"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2611("TIP1-A_2611", "Berücksichtigung des Klonens im Sicherheitskonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2612("TIP1-A_2612", "Anwendung des Vier-Augen-Prinzips beim Klonen eines HSMs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2613("TIP1-A_2613", "Protokollierung beim Klonen eines HSMs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2614("TIP1-A_2614", "Nachvollziehbarkeit über die Klone eines HSMs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2615("TIP1-A_2615", "Einsatz der Klone eines HSMs im geschützten Bereich der Betriebsstätte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2616("TIP1-A_2616", "Evaluierung von HSMs - TSP-CVC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2617("TIP1-A_2617", "Vorgaben an die Funktionalität des HSM der CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2618("TIP1-A_2618", "Weitergabe sensitiver Schlüssel"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2619("TIP1-A_2619", "Authentizität des öffentlichen Schlüssels der CVC-CA bei Zertifikatsbeantragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2620("TIP1-A_2620", "Backup und Verfügbarkeit der CVC-CA für Produktiv- und Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2621("TIP1-A_2621", "Backup-HSMs - sicherer Schlüsseltransport CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2622("TIP1-A_2622", "Erzeugung eines Backup-HSMs - Einhaltung weiterer Vorgaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2626("TIP1-A_2626", "Berücksichtigung von Notfallmaßnahmen im Sicherheitskonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2627("TIP1-A_2627", "Wechsel der Schlüsselversion bei der CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2628("TIP1-A_2628", "Protokollierung durch den TSP-CVC - Ereignisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2629("TIP1-A_2629", "Protokollierung durch den TSP-CVC - Profil ungleich 0"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2630("TIP1-A_2630", "Protokollierung pro Bestellung/Produktionslauf (Profil gleich 0)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2631("TIP1-A_2631", "Nachvollziehbarkeit bei Produktion mit Profil 0"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2632("TIP1-A_2632", "Schutz der Protokolldaten gegen Manipulation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2633("TIP1-A_2633", "Prüfung der Protokolldaten durch die gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2634("TIP1-A_2634", "Berücksichtigung von Rollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2635("TIP1-A_2635", "Definition der Rollen und Festlegungen ihrer Aufgaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2636("TIP1-A_2636", "Benennung von Mitarbeitern gegenüber gematik"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2637("TIP1-A_2637", "Berücksichtigung von Zugriffen auf das HSM im Vier-Augen- Prinzip"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2641("TIP1-A_2641", "Geschützter Bereich"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2642("TIP1-A_2642", "Verwendung mehrerer geschützter Bereiche"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2644("TIP1-A_2644", "Schutz von HSM-Klonen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2645("TIP1-A_2645", "Zugriffe auf Systeme der CVC-CA über Arbeitsplatzrechner (oder Systeme) außerhalb des geschützten Bereichs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2647("TIP1-A_2647", "Sicherer Betrieb von Systemkomponenten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2648("TIP1-A_2648", "Vier-Augen-Prinzip bei Beantragung des CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2649("TIP1-A_2649", "Konsistenzprüfung des ausgestellten CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2650("TIP1-A_2650", "Behandlung negativer Prüfergebnisse im Sicherheitskonzept"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2654("TIP1-A_2654", "Antrag für ein CVC-CA-Zertifikat bei der CVC-Root-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2655("TIP1-A_2655", "Konsistenz des CA-Namens"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2656("TIP1-A_2656", "Beantragung und Rollen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2657("TIP1-A_2657", "Korrektheit der Angaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2658("TIP1-A_2658", "Nutzung der Schnittstelle zur Beantragung eines CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2659("TIP1-A_2659", "Name der CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2660("TIP1-A_2660", "CA-Namen bei Betrieb mehrerer CVC-CAs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2665("TIP1-A_2665", "Berechtigung des Antragstellers für CV-Zertifikate"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2666("TIP1-A_2666", "Schriftliche Beantragung von CV-Zertifikaten durch einen Kartenherausgeber"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2669("TIP1-A_2669", "Ausgangsdaten der CV-Zertifikatserzeugung, die durch die CVC-CA zur Verfügung gestellt werden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2671("TIP1-A_2671", "Anforderungen an die Datenintegrität und -authentizität"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2672("TIP1-A_2672", "Anforderungen an die Vertraulichkeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2673("TIP1-A_2673", "Berücksichtigung von Eingangsdaten gemäß [gemSpec_PKI]"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2676("TIP1-A_2676", "Verwendung der Eingangsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2677("TIP1-A_2677", "Signierung des CV-Zertifikats durch die CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2680("TIP1-A_2680", "Eindeutigkeit der Zuordnung zwischen CAR und Schlüsselpaar der CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2691("TIP1-A_2691", "Protokollierung durch den TSP-CVC - Werte"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2692("TIP1-A_2692", "Protokollierung durch den TSP-CVC - Profil gleich 0"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2695("TIP1-A_2695", "Verfahren zur Zeitsynchronisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_2696("TIP1-A_2696", "Sicherstellung der Zuordnung von CV-Zertifikaten bei mehreren CVC-CAs mit gleichem Namen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3029("TIP1-A_3029", "Name einer Test-CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3030("TIP1-A_3030", "Betrieb von Test-CVC-CAs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3031("TIP1-A_3031", "Registrierung einer Test-CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_3032("TIP1-A_3032", "Signierung des Test-CV-Zertifikats durch die Test-CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4222("TIP1-A_4222", "Authentizität des öffentlichen Root-Schlüssels"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4223("TIP1-A_4223", "Ordnungsgemäße Sicherung des privaten Schlüssels der CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4224("TIP1-A_4224", "Verwendung von privaten Schlüsseln einer CVC-CA"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4225("TIP1-A_4225", "Nutzung eines HSM nach erfolgreicher Benutzerauthentisierung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4228("TIP1-A_4228", "Angaben in der Beantragung eines CVC-CA-Zertifikats"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_4229("TIP1-A_4229", "Optionale Sicherheitsmechanismen bei Ausgabe von Test-CV- Zertifikaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5378("TIP1-A_5378", "Setzen der Certificate Effective Date (CED)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5379("TIP1-A_5379", "Setzen der Certificate Expiration Date (CXD)"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    TIP1_A_5381("TIP1-A_5381", "Zugang zu HSM-Systemen im Vier-Augen-Prinzip"),

    ;

    private final String afoID;

    private final AFOType level;

    private final String title;

    private AFOs(final String afoID, final String title) {
        this(afoID, title, MUST);
    }

    private AFOs(final String afoID, final String title, final AFOType level) {
        assert nonNull(afoID) : "There must be a non-null AFO id!";
        assert !afoID.isEmpty() : "There must be a non-empty AFO id!";
        assert nonNull(title) : "There must be a non-null AFO title!";
        assert !title.isEmpty() : "There must be a non-empty AFO title!";
        assert nonNull(level) : "There must be a non-null AFO type!";

        this.afoID = afoID;
        this.title = title;
        this.level = level;
    }

    @Override
    public String getAfoId() {
        assert nonNull(this.afoID) : "Class invariant violation!";
        assert !this.afoID.isEmpty() : "Class invariant violation!";

        return this.afoID;
    }

    @Override
    public String getLabel() {
        assert nonNull(this.title) : "Class invariant violation!";
        assert !this.title.isEmpty() : "Class invariant violation!";

        return this.title;
    }

    @Override
    public AFOType getType() {
        assert nonNull(this.level) : "Class invariant violation!";

        return this.level;
    }
}