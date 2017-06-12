package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.DeviceAccessProfile.G_SMC_K;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.DeviceAccessProfile.G_SMC_KT;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.DeviceAccessProfile.G_SM_B;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.DeviceAccessProfile.HBA;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.APOTHEKER;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.ARZT;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.EKIOSK;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.GESUNDHEITSEINRICHTUNGEN;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.HEILMITTELERBRINGER;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.KOSTENTRAEGER;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.PSYCHOTHERAPEUT;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.RESERVIERT;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.RETTUNGSASSISTENT;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.UZWDRDV;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc.ProfessionAccessProfile.VERSICHERTER;
import static java.util.Arrays.stream;

import java.util.HashMap;
import java.util.Map;

public enum AccessProfileFlags {

    FLAGS_VERSICHERTER(VERSICHERTER, "00000000000000"), //
    FLAGS_EKIOSK(EKIOSK, "00AE1ACD51DC00"), //
    FLAGS_ARZT(ARZT, "005D29DAA8BB00"), //
    FLAGS_ZAHNARZT(ARZT, "005D20DAA88300"), //
    FLAGS_APOTHEKER(APOTHEKER, "005C40DAA88300"), //
    FLAGS_PSYCHOTHERAPEUT(PSYCHOTHERAPEUT, "004C40DAA88200"), //
    FLAGS_HEILMITTELERBRINGER(HEILMITTELERBRINGER, "005C0002A80000"), //
    FLAGS_RESERVIERT(RESERVIERT, "00000000000000"), //
    FLAGS_RETTUNGSASSISTENT(RETTUNGSASSISTENT, "00002004880000"), //
    FLAGS_KOSTENTRAEGER(KOSTENTRAEGER, "00400002A80000"), //
    FLAGS_GESUNDHEITSEINRICHTUNGEN(GESUNDHEITSEINRICHTUNGEN, "0068000AA80000"), //
    FLAGS_UZWDRDV(UZWDRDV, "00AF5ACD51DF00"), //

    FLAGS_G_SMC_K(G_SMC_K, "000000000001’"), //
    FLAGS_HBA(HBA, "0000000000000C"), //
    FLAGS_G_SMC_KT(G_SMC_KT, "000000000002"), //
    FLAGS_G_SM_B(G_SM_B, "000000000004"), //

    ;

    private static Map<AccessProfile, String> flaglistMap = new HashMap<>();

    static {
        stream(AccessProfileFlags.values()).forEach(apf -> flaglistMap.put(apf.getAccessProfile(), apf.getFlaglistHex()));
    }

    private final AccessProfile accessProfile;
    private final String flaglistHex;

    private AccessProfileFlags(final AccessProfile accessProfile, final String flaglistHex) {
        this.accessProfile = accessProfile;
        this.flaglistHex = flaglistHex;
    }

    public AccessProfile getAccessProfile() {
        return this.accessProfile;
    }

    public String getFlaglistHex() {
        return this.flaglistHex;
    }

    public static String getFlaglistHexForAccessProfile(final AccessProfile accessProfile) {
        return flaglistMap.get(accessProfile);
    }
}
