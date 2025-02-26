package org.example.rest.models;

import java.util.Arrays;
import java.util.Optional;

public enum Mti {

    // Authorization Requests and Responses
    AUTH_REQUEST("0100", "Authorization response", "0110"),
    AUTH_ADVICE_REQUEST("0120", "Authorization advice response", "0130"),

    // Financial Transactions
    FIN_REQUEST("0200", "Financial transaction response", "0210"),
    FIN_ADVICE_REQUEST("0220", "Financial advice response", "0230"),

    // Reversal Requests and Responses
    REVERSAL_REQUEST("0400", "Reversal response", "0410"),
    REVERSAL_ADVICE_REQUEST("0420", "Reversal advice response", "0430"),

    // Batch Uploads
    BATCH_UPLOAD_REQUEST("0500", "Batch upload response", "0510"),
    BATCH_UPLOAD_ADVICE_REQUEST("0520", "Batch upload advice response", "0530"),

    // Administrative Messages
    ADMIN_REQUEST("0600", "Administrative response", "0610"),
    ADMIN_ADVICE_REQUEST("0620", "Administrative advice response", "0630"),

    // Network Management Messages
    NETWORK_MGMT_REQUEST("0800", "Network management response", "0810");

    private final String requestCode;
    private final String description;
    private final String responseCode;

    Mti(String requestCode, String description, String responseCode) {
        this.requestCode = requestCode;
        this.description = description;
        this.responseCode = responseCode;
    }

    public String getRequestCode() {
        return requestCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Finds the MTI response for a given request code.
     *
     * @param requestCode The incoming request MTI.
     * @return Optional<Mti> - the matching enum if found, otherwise empty.
     */
    public static Optional<Mti> fromRequestCode(String requestCode) {
        return Arrays.stream(values())
                .filter(mti -> mti.requestCode.equals(requestCode))
                .findFirst();
    }
}
