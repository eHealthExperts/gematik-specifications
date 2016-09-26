package de.ehex.foss.gematik.specifications.gemRL_Betr_TI;

import static de.ehex.foss.gematik.specifications.AFOType.MUST;
import static java.util.Objects.nonNull;

import de.ehex.foss.gematik.specifications.AFO;
import de.ehex.foss.gematik.specifications.AFOType;

/**
 * Enumeration of all &ndash;&nbsp;currently considered&nbsp;&ndash; {@link AFO}s of {@code [gemRL_Betr_TI]}.
 *
 * @author Stefan Gasterst&auml;dt
 * @since September 21st, 2016
 */
public enum AFOs implements AFO {

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3876("GS-A_3876", "Vorprüfung im Anwendersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3877("GS-A_3877", "Prüfung auf Erfüllung von Prioritätsanforderungen im lokalen Incident Management im Anwendersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3878("GS-A_3878", "Nachträgliche strukturierte Informationsübermittlung von übergreifenden Incidents im Anwendersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3879("GS-A_3879", "Schriftliche Erfassung von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3880("GS-A_3880", "eineindeutige Referenznummer von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3881("GS-A_3881", "Eineindeutigkeit der Incident-ID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3882("GS-A_3882", "Mindestinhalte von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3883("GS-A_3883", "Kategorisierung von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3884("GS-A_3884", "Priorisierung von Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3885("GS-A_3885", "strukturierte Informationsübermittlung von übergreifenden Incidents im Anwendersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3886("GS-A_3886", "Nutzung der Kommunikationsschnittstelle bei strukturierter Informationsübermittlung von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3887("GS-A_3887", "Status eines übergreifenden Incidents während der Bearbeitung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3888("GS-A_3888", "Verifikation vor Schließung eines übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3889("GS-A_3889", "Schließung der übergreifenden Incident-Dokumentation, mit abschließender Bearbeitung im Anwendersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3890("GS-A_3890", "Information bei Schließung der übergreifenden IncidentDokumentation im Anwendersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3891("GS-A_3891", "Service Requirements im Anwendersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3892("GS-A_3892", "Prüfung auf Erfüllung von Prioritätsanforderungen im lokalen Incident Management im Anbieter-/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3893("GS-A_3893", "nachträgliche strukturierte Informationsübermittlung von lokalen Incidents im Anbieter-/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3894("GS-A_3894", "qualifizierte Meldung einer Störung im Anbieter/Herstellersupport, ohne Meldung durch Anwender/PED"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3895("GS-A_3895", "Erfassung und Übermittlung eines übergreifenden Incidents im Rahmen der qualifizierten Meldung im Anbieter/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3896("GS-A_3896", "interne Erfassung des übergreifenden Incidents im Rahmen der qualifizierten Meldung im Anbieter-/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3902("GS-A_3902", "Vorprüfung im Anbieter-/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3903("GS-A_3903", "Empfangsbestätigung von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3904("GS-A_3904", "Incident-Annahme"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3905("GS-A_3905", "Ablehnung von übergreifenden Incidents im Anbieter/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3906("GS-A_3906", "Bearbeitung von übergreifenden Incidents bei Lösungsverantwortung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3907("GS-A_3907", "Lösung von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3908("GS-A_3908", "Schließung übergreifender Incident, mit abschließender Bearbeitung im Anbieter-/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3909("GS-A_3909", "interne Dokumentation einer übergreifenden Incident-Meldung, bei nicht vorhandener Lösungsverantwortung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3910("GS-A_3910", "strukturierte Informationsübermittlung von übergreifender Incidents im Anbieter/-Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3911("GS-A_3911", "Service Level Requirements Anbieter-/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3912("GS-A_3912", "Messung der Gesamtlösungszeit"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3913("GS-A_3913", "prioritätsabhängige Meldungen im lokalen Incident Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3914("GS-A_3914", "Statusinformation bei übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3915("GS-A_3915", "Information bei Annahme von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3916("GS-A_3916", "Informationen bei Bearbeitung von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3917("GS-A_3917", "Bereitstellung der Incident-Dokumentation bei Audits"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3918("GS-A_3918", "Integrität der Dokumentation von übergreifenden Incidents"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3919("GS-A_3919", "Bereitstellung Eskalationsschnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3920("GS-A_3920", "Eskalationseinleitung durch den Anbieter und Hersteller im INC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3921("GS-A_3921", "Eskalationsinhalte im INC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3922("GS-A_3922", "Mitwirkung bei serviceübergreifenden Taskforces im Eskalationsfall"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3923("GS-A_3923", "Zusendung von Reports an den Servicebetriebsverantwortlichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3924("GS-A_3924", "Bereitstellung von Vorgangsdaten aus dem übergreifenden Incident Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3925("GS-A_3925", "Reportinhalte von Vorgangsdaten aus dem übergreifenden Incident Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3958("GS-A_3958", "Problemerkennung durch Anbieter und Hersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3959("GS-A_3959", "Vorprüfung als Problemerkennender"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3960("GS-A_3960", "Statusinformation an SBV für lokale Problems"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3961("GS-A_3961", "eineindeutige Referenznummer von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3962("GS-A_3962", "Eineindeutigkeit der Problem ID"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3963("GS-A_3963", "Kategorisierung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3964("GS-A_3964", "Priorisierung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3965("GS-A_3965", "Anfrage zur Unterstützung von übergreifenden Problemen bei lösungsunterstützenden Anbietern oder Herstellern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3966("GS-A_3966", "Zusendung der Anfrage zur Unterstützung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3967("GS-A_3967", "Nutzung der Kommunikationsschnittstelle bei Anfrage zur Unterstützung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3968("GS-A_3968", "Anfrage zur Ermittlung der Problemlösungsverantwortung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3969("GS-A_3969", "Zusendung der Anfrage zur Ermittlung der Problemlösungsverantwortung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3970("GS-A_3970", "Nutzung der Kommunikationsschnittstelle bei Anfrage zur Ermittlung der Problemlösungsverantwortung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3971("GS-A_3971", "Problem nach Verifizierung schließen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3972("GS-A_3972", "Service Level Requirements problemerkennende Anbieter und Hersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3975("GS-A_3975", "Vorprüfung lösungsunterstützende Anbieter und Hersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3976("GS-A_3976", "Ablehnung von übergreifenden Problemen bei lösungsunterstützenden A/H"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3977("GS-A_3977", "Unterstützung bei übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3978("GS-A_3978", "Service Level Requirements für lösungsunterstützende Anbieter und Hersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3981("GS-A_3981", "Problembearbeitung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3982("GS-A_3982", "Ablehnung von übergreifenden Problemen bei problemlösungsverantwortlichen A/H"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3983("GS-A_3983", "Ursachenanalyse von übergreifenden Problemen durch Problemlösungsverantwortlichen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3984("GS-A_3984", "Anfrage zur Bereitstellung der TI-Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3985("GS-A_3985", "Anfrage Produkttypvorgaben"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3986("GS-A_3986", "problemlösungsverantwortliche Koordination von übergreifenden Problems"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3987("GS-A_3987", "Lösung von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3988("GS-A_3988", "Versendung Verifizierung vor Schließung eines übergreifenden Problems"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3989("GS-A_3989", "Nacharbeitung vor Schließung eines übergreifenden Problems"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3990("GS-A_3990", "Schließung nach Verifizierung des Problemerkennenden"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3991("GS-A_3991", "WDB Aktualisierung nach Schließung der übergreifenden Problemmeldungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3992("GS-A_3992", "Service Level Requirements problemlösungsverantwortliche Anbieter und Hersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3993("GS-A_3993", "Information bei Feststellung von Problemen im lokalen und übergreifenden Problem Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3994("GS-A_3994", "Statusinformation bei lokalen und übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3995("GS-A_3995", "Eskalationseinleitung durch den Anbieter und Hersteller im PRO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3996("GS-A_3996", "Eskalationsinhalte im PRO"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3997("GS-A_3997", "Mitwirkung bei Taskforces im Eskalationsfall"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3998("GS-A_3998", "Bereitstellung von Problemdokumentationen aus dem übergreifenden Problem Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_3999("GS-A_3999", "Reportinhalte von Vorgangsdaten aus dem übergreifenden Problem Management"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4000("GS-A_4000", "Mindestinhalte Dokumentation von übergreifenden Problemen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4085("GS-A_4085", "Etablierung von Kommunikationsschnittstellen durch die A/H"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4086("GS-A_4086", "Erreichbarkeit von Kommunikationsschnittstellen der A/H"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4087("GS-A_4087", "Erreichbarkeit der Kommunikationsschnittstelle bei Rufbereitschaften außerhalb der Servicezeiten der A/H"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4088("GS-A_4088", "Bereitstellung eines technischen Ansprechpartners durch A/H"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4089("GS-A_4089", "Bereitstellung eines kaufmännischen Ansprechpartners durch A/H"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4090("GS-A_4090", "Kommunikationssprache zwischen den Prozessbeteiligten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4091("GS-A_4091", "Dokumentationssprache"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4092("GS-A_4092", "Übermittlung des konsolidierten Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4093("GS-A_4093", "Dateinamen der Einzelreports im konsolidierten und Ad-hoc Reporting"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4094("GS-A_4094", "Service Level Requirements Serviceerbringung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4095("GS-A_4095", "Übermittlung von Ad-hoc Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4096("GS-A_4096", "Weiterbearbeit- und Auswertbarkeit des Ad-hoc Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4097("GS-A_4097", "Dateiformat und -struktur des Ad-hoc Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4099("GS-A_4099", "Zulieferungszeit des Ad-hoc Reports an den SBV oder GBV TI"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4100("GS-A_4100", "Messung der Service Level"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4101("GS-A_4101", "Übermittlung der Service Level Messergebnisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4102("GS-A_4102", "Dateistruktur des Service Level Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4103("GS-A_4103", "Dateiformat des Service Level Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4106("GS-A_4106", "Reportinhalte und Format des Performance-Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4108("GS-A_4108", "Inhalt von Ad-hoc Reports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4109("GS-A_4109", "Service Level Requirements Anbieter-Performance-Messungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4112("GS-A_4112", "Datenbereitstellung für CI „Produktverantwortliche Organisation“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4113("GS-A_4113", "Datenänderung für CI „Produktverantwortliche Organisation“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4114("GS-A_4114", "Datenbereitstellung für CI „Produkt“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4115("GS-A_4115", "Datenänderung für CI „Produkt“"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4116("GS-A_4116", "Bereitstellung Ad-hoc Report"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4117("GS-A_4117", "Bereitstellung der Produktinformation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4118("GS-A_4118", "Bekanntmachung Support-Schnittstelle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4119("GS-A_4119", "Benennung der Ansprechpartner"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4120("GS-A_4120", "nachträgliche strukturierte Informationsübermittlung von übergreifenden Incidents im Anbieter-/Herstellersupport"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4121("GS-A_4121", "Analyse Auswirkungen möglicher Schadensereignisse auf Sicherheit und Funktion der TI-Services"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4122("GS-A_4122", "Unterstützung TI-Notfallvorsorge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4123("GS-A_4123", "Entwicklung und Pflege der TI-Notfallvorsorgedokumentation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4124("GS-A_4124", "Umsetzung Vorkehrungen zur TI-Notfallvorsorge"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4125("GS-A_4125", "TI-Notfallerkennung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4126("GS-A_4126", "Eskalation TI-Notfälle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4127("GS-A_4127", "Sofortmaßnahmen TI-Notfälle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4128("GS-A_4128", "Bewältigung der TI-Notfälle"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4129("GS-A_4129", "Unterstützung bei TI-Notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4130("GS-A_4130", "Festlegung der Räumlichkeiten für EMC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4131("GS-A_4131", "Bereitstellung der Ansprechpartner und Teilnehmer für EMC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4132("GS-A_4132", "Durchführung der Wiederherstellung und TI-Notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4133("GS-A_4133", "Rollback-Verfahren nach TI-Notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4134("GS-A_4134", "Auswertungen von TI-Notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4135("GS-A_4135", "Service Level Requirements Anbieter und Hersteller"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4136("GS-A_4136", "Statusinformation bei TI-Notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4137("GS-A_4137", "Dokumentation im TI-Notfall-Logbuch"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4138("GS-A_4138", "Erstellung des Wiederherstellungsberichts nach TI-Notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4139("GS-A_4139", "Rollback-Bericht nach TI-Notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4397("GS-A_4397", "Teilnahme am Service Review"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4398("GS-A_4398", "Vorprüfung von durch Anbieter oder Hersteller festgestellten Produktänderungsbedarfen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4399("GS-A_4399", "Übermittlung von Produktdaten nach Abschluss von lokal autorisierten Produkt-Changes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4400("GS-A_4400", "Produkt-RfC aufzeichnen & an SBV übermitteln"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4401("GS-A_4401", "Registrierung von durch den SBV übermittelten Produkt-RfCs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4402("GS-A_4402", "Mitwirkungspflicht bei Bewertung von Produkt-RfCs"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4404("GS-A_4404", "Übermittlung von Produktdaten nach Abschluss von genehmigungspflichtigen Produkt-Changes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4405("GS-A_4405", "Service Level Requirements Anbieter und Hersteller für genehmigungspflichtige Produkt-Changes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4406("GS-A_4406", "Aktualität des Change- & Releasekalenders"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4407("GS-A_4407", "Bereitstellung der Dokumentation des Change Managements für genehmigungspflichtige Produkt-Changes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4408("GS-A_4408", "Eskalation für genehmigte Produkt-Changes während der Test- oder Deploymentdurchführung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4409("GS-A_4409", "Eskalation für genehmigte Produkt-Changes während der Bewertung von Produkt-Changes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4410("GS-A_4410", "Bereitstellung von Vorgangsdaten für genehmigte Produkt Changes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4411("GS-A_4411", "Reportinginhalte des Change-Management-Prozessreportings"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4412("GS-A_4412", "Bereitstellung der Change-Management-Vorgangsdaten mittels Prozessreporting"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4413("GS-A_4413", "Aktualisierung der Produktinformation"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4414("GS-A_4414", "Beteiligung von Herstellern und Anbietern an der Bewertung von Produkttyp-Changes mittels Befragung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4415("GS-A_4415", "Aktualisierung des Vorgangsdatenreports"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4416("GS-A_4416", "Planung von Produkt-Changes gemäß Produkt-RfC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4417("GS-A_4417", "Stetige Aktualisierung von Planungs- und Realisierungsdaten"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4418("GS-A_4418", "Übermittlung von Abweichungen vom Produkt-RfC"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4419("GS-A_4419", "Nutzung der Testumgebung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4420("GS-A_4420", "Übermittlung der lokalen Testergebnisse"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4421("GS-A_4421", "Zulassung und Abnahme von entwickelten Produkt-Changes"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4422("GS-A_4422", "Überführung von Produkten durch Anbieter und Hersteller in den Wirkbetrieb"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4423("GS-A_4423", "Abstimmung von Wartungsfenster für genehmigungspflichtige Änderungen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4424("GS-A_4424", "Umsetzung des Fallbackplans"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4425("GS-A_4425", "Übermittlung von Optimierungsmöglichkeiten zur Umsetzung von genehmigten Produkt-Changes an den SBV"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4855("GS-A_4855", "Auditierung von Anbietern und Herstellern"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4892("GS-A_4892", "Eingangsbestätigung für den Melder"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_4893("GS-A_4893", "Kommunikationsschnittstellen im Rahmen von TI-Notfällen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5086("GS-A_5086", "Bearbeitung und Lösung von lokalen Incidents bei Lösungsverantwortung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5200("GS-A_5200", "Konvention zu Dateinamen zur Übermittlung von Incident- und Problemdokumentationen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5248("GS-A_5248", "Konventionen zu csv-Dateinnamen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5249("GS-A_5249", "Reservierte Zeichen in csv-Datensätzen"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5250("GS-A_5250", "Lösungsverifikation vor Schließung"),

    // TODO: AFO-Typ klären derzeit implizit MUSS-AFO
    GS_A_5251("GS-A_5251", "Übermittlung von Fehlerlogs, Systemprotokollen der Produktinstanzen und lokalen Incidents"),

    ;

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

    private final String afoID;

    @Override
    public String getAfoId() {
        assert nonNull(this.afoID) : "Class invariant violation!";
        assert !this.afoID.isEmpty() : "Class invariant violation!";

        return this.afoID;
    }

    private final String title;

    @Override
    public String getLabel() {
        assert nonNull(this.title) : "Class invariant violation!";
        assert !this.title.isEmpty() : "Class invariant violation!";

        return this.title;
    }

    private final AFOType level;

    @Override
    public AFOType getType() {
        assert nonNull(this.level) : "Class invariant violation!";

        return this.level;
    }

}
