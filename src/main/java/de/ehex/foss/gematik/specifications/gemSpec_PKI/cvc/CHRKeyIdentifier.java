package de.ehex.foss.gematik.specifications.gemSpec_PKI.cvc;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCHolder.EGK;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCHolder.HPC;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCHolder.SAK;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCHolder.SMC;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCInstance.E256;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCInstance.E384;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCInstance.R2048;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCUsage.AUTD_CVC;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCUsage.AUTD_RPE_CVC;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCUsage.AUTD_RPS_CVC;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCUsage.AUTD_SUK_CVC;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCUsage.AUTR_CVC;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CVCUsage.AUT_CVC;
import static de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CertificateType.CV_CERT;

import java.nio.ByteBuffer;

import de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject.CryptographicObject;
import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of key identifiers of certificate holder references (CHR) of CV certificates (see 6.4.1.3 Certificate
 * Holder Reference (CHR), Übergreifende Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb.
 * 06th 2017)
 *
 * @author Sascha Zak
 * @since May 04th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "6.4.1.3 Certificate Holder Reference (CHR)")
public enum CHRKeyIdentifier {

    // eGK
    EGK_AUT_CVC_E256(0x0009, CryptographicObject.of(CV_CERT, EGK, AUT_CVC, null, E256)), //

    // HBA
    HPC_AUTR_CVC_R2048(0x0010, CryptographicObject.of(CV_CERT, HPC, AUTR_CVC, null, R2048)), //
    HPC_AUTR_CVC_E256(0x0006, CryptographicObject.of(CV_CERT, HPC, AUTR_CVC, null, E256)), //
    HPC_AUTD_SUK_CVC_E256(0x0009, CryptographicObject.of(CV_CERT, HPC, AUTD_SUK_CVC, null, E256)), //

    // SMC-B
    SMC_AUTR_CVC_R2048(0x0010, CryptographicObject.of(CV_CERT, SMC, AUTR_CVC, null, R2048)), //
    SMC_AUTR_CVC_E256(0x0006, CryptographicObject.of(CV_CERT, SMC, AUTR_CVC, null, E256)), //
    SMC_AUTD__RPE_CVC_E256(0x0009, CryptographicObject.of(CV_CERT, SMC, AUTD_RPE_CVC, null, E256)), //

    // gSMC-K
    SMC_AUT_CVC_E256(0x0005, CryptographicObject.of(CV_CERT, SMC, AUT_CVC, null, E256)), //
    SMC_AUT_CVC_E384(0x0006, CryptographicObject.of(CV_CERT, SMC, AUT_CVC, null, E384)), //
    SAK_AUTD_CVC_E256(0x000A, CryptographicObject.of(CV_CERT, SAK, AUTD_CVC, null, E256)), //
    SAK_AUTD_CVC_E384(0x000F, CryptographicObject.of(CV_CERT, SAK, AUTD_CVC, null, E384)), //

    // gSMC-KT
    SMC_AUTD_RPS_CVC_E256(0x000A, CryptographicObject.of(CV_CERT, SMC, AUTD_RPS_CVC, null, E256)), //
    SMS_AUTD_RPS_CVC_E384(0x000F, CryptographicObject.of(CV_CERT, SMC, AUTD_RPS_CVC, null, E384)), //
    ;

    private final CryptographicObject cvCertificate;
    private final byte[] keyId;

    private CHRKeyIdentifier(final int keyId, final CryptographicObject cvCertificate) {
        this.cvCertificate = cvCertificate;
        final byte[] keyIdArray = ByteBuffer.allocate(Integer.BYTES).putInt(keyId).array();
        this.keyId = new byte[] { keyIdArray[keyIdArray.length - 2], keyIdArray[keyIdArray.length - 1] };
    }

    /**
     * Returns the 2-byte key identifier.
     *
     * @return key identifier
     */
    public byte[] getKeyId() {
        return this.keyId;
    }

    /**
     * Returns the {@link CryptographicObject} representing the certificate that belongs to the key identifier.
     *
     * @return certificate belonging to the key identifier
     */
    public CryptographicObject getCvCertificate() {
        return this.cvCertificate;
    }
}
