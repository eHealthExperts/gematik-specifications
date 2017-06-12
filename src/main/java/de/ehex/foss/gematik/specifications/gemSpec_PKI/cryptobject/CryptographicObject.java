package de.ehex.foss.gematik.specifications.gemSpec_PKI.cryptobject;

import static de.ehex.foss.gematik.specifications.Specifications.gemSpec_PKI;
import static java.lang.String.format;
import static java.util.Arrays.deepEquals;
import static java.util.Arrays.deepHashCode;

import de.ehex.foss.gematik.specifications.meta.SPEC;

/**
 * Definition of structure and notation of cryptographic objects, (see 2 Notation kryptographischer Objekte,
 * Übergreifende Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
 *
 * @author Sascha Zak
 * @since April 20th, 2017
 */
@SPEC(value = gemSpec_PKI, note = "2. Notation kryptographischer Objekte")
public abstract interface CryptographicObject {

    /**
     * Returns the type of the {@link CryptographicObject} .
     *
     * @return object type
     */
    public abstract Type getType();

    /**
     * Returns the holder of the {@link CryptographicObject}.
     *
     * @return object holder
     */
    public abstract Holder getHolder();

    /**
     * Returns the usage of the {@link CryptographicObject}.
     *
     * @return object usage
     */
    public abstract Usage getUsage();

    /**
     * Return the sequential number of the {@link CryptographicObject}.
     *
     * @return object sequential number
     */
    public abstract SequentialNumber getN();

    /**
     * Returns the instance of the {@link CryptographicObject}.
     *
     * @return object instance
     */
    public abstract Instance getInstance();

    /**
     * Returns the basic designator of the {@link CryptographicObject}.
     *
     * @return basic designator
     */
    @SPEC(value = gemSpec_PKI, note = "2.1 Basis-Bezeichner")
    public default String getBasicDesignator() {
        return format("%s.%s.%s", getType().getValue(), getHolder().getValue(), getUsage().getValue());
    }

    /**
     * Returns the instance designator of the {@link CryptographicObject}.
     *
     * @return instance designator
     */
    @SPEC(value = gemSpec_PKI, note = "2.2 Optionale Bezeichnung der technischen Ausprägung")
    public default String getInstanceDesignator() {
        return format("%s%s.%s", getBasicDesignator(), (getN() != null ? getN().getValue() : ""), (getInstance() != null ? getInstance().getValue() : ""));
    }

    /**
     * Creates a new {@link CryptographicObject} with the given structure components.
     *
     * @param type
     *            object {@link Type}
     * @param holder
     *            object {@link Holder}
     * @param usage
     *            object {@link Usage}
     * @param n
     *            sequential number
     * @param instance
     *            concrete {@link Instance}
     * @return new {@link CryptographicObject} instance
     */
    public static CryptographicObject of(final Type type, final Holder holder, final Usage usage, final SequentialNumber n, final Instance instance) {
        return new CryptographicObject() {

            @Override
            public Usage getUsage() {
                return usage;
            }

            @Override
            public Type getType() {
                return type;
            }

            @Override
            public SequentialNumber getN() {
                return n;
            }

            @Override
            public Instance getInstance() {
                return instance;
            }

            @Override
            public Holder getHolder() {
                return holder;
            }

            @Override
            public boolean equals(final Object other) {
                if (this == other) {
                    return true;
                } else if (other == null) {
                    return false;
                } else if (!(other instanceof CryptographicObject)) {
                    return false;
                } else {
                    final CryptographicObject that = (CryptographicObject) other;
                    return deepEquals(
                            new Object[] { (this.getType() == null ? null : this.getType().getValue()), (this.getHolder() == null ? null : this.getHolder().getValue()), (this.getUsage() == null ? null : this.getUsage().getValue()),
                                    (this.getN() == null ? null : this.getN().getValue()), (this.getInstance() == null ? null : this.getInstance().getValue()) },
                            new Object[] { (that.getType() == null ? null : that.getType().getValue()), (that.getHolder() == null ? null : that.getHolder().getValue()), (that.getUsage() == null ? null : that.getUsage().getValue()),
                                    (that.getN() == null ? null : that.getN().getValue()), (that.getInstance() == null ? null : that.getInstance().getValue()) });
                }
            }

            @Override
            public int hashCode() {
                return deepHashCode(new Object[] { (this.getType() == null ? null : this.getType().getValue()), (this.getHolder() == null ? null : this.getHolder().getValue()), (this.getUsage() == null ? null : this.getUsage().getValue()),
                        (this.getN() == null ? null : this.getN().getValue()), (this.getInstance() == null ? null : this.getInstance().getValue()) });
            }
        };
    }

    /**
     * Definition of a type of {@link CryptographicObject}s (see 2.5 Type (Objekttyp), Übergreifende Spezifikation
     * Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
     *
     * @author Sascha Zak
     * @since April 20th, 2017
     */
    @SPEC(value = gemSpec_PKI, note = "2.5 Type (Objekttyp)")
    @FunctionalInterface
    public static abstract interface Type {

        /**
         * Returns the {@link Type}'s value.
         *
         * @return value
         */
        public abstract String getValue();
    }

    /**
     * Definition of a holder of {@link CryptographicObject}s (see 2.6 Holder (Objektbesitzer), Übergreifende
     * Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
     *
     * @author Sascha Zak
     * @since April 20th, 2017
     */
    @SPEC(value = gemSpec_PKI, note = "2.6 Holder (Objektbesitzer)")
    @FunctionalInterface
    public static abstract interface Holder {

        /**
         * Returns the {@link Holder}'s value.
         *
         * @return value
         */
        public abstract String getValue();
    }

    /**
     * Definition of a usage of {@link CryptographicObject}s (see 2.7 Usage (Objektverwendung), Übergreifende
     * Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
     *
     * @author Sascha Zak
     * @since April 20th, 2017
     */
    @SPEC(value = gemSpec_PKI, note = "2.7 Usage (Objektverwendung)")
    @FunctionalInterface
    public static abstract interface Usage {

        /**
         * Returns the {@link Usage}'s value.
         *
         * @return value
         */
        public abstract String getValue();

    }

    /**
     * Definition of sequential number of {@link CryptographicObject}s (see 2.8 n (lfd. Nummer), Übergreifende
     * Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
     *
     * @author Sascha Zak
     * @since April 20th, 2017
     */
    @SPEC(value = gemSpec_PKI, note = "2.8 n (lfd. Nummer)")
    @FunctionalInterface
    public static abstract interface SequentialNumber {

        /**
         * Returns the {@link SequentialNumber}'s value.
         *
         * @return value
         */
        public abstract int getValue();
    }

    /**
     * Definition of a instance of {@link CryptographicObject}s (see 2.9 Instance (Ausprägung), Übergreifende
     * Spezifikation Spezifikation PKI [gemSpec_PKI], version 1.11.0, released Feb. 06th 2017)
     *
     * @author Sascha Zak
     * @since April 20th, 2017
     */
    @SPEC(value = gemSpec_PKI, note = "2.9 Instance (Ausprägung)")
    @FunctionalInterface
    public static abstract interface Instance {

        /**
         * Returns the {@link Instance}'s value.
         *
         * @return value
         */
        public abstract String getValue();
    }
}
