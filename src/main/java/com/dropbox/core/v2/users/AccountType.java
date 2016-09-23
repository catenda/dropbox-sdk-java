/* DO NOT EDIT */
/* This file was generated from users.stone */

package com.dropbox.core.v2.users;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * What type of account this user has.
 */
public enum AccountType {
    // union AccountType
    /**
     * The basic account type.
     */
    BASIC,
    /**
     * The Dropbox Pro account type.
     */
    PRO,
    /**
     * The Dropbox Business account type.
     */
    BUSINESS;

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<AccountType> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(AccountType value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case BASIC: {
                    g.writeString("basic");
                    break;
                }
                case PRO: {
                    g.writeString("pro");
                    break;
                }
                case BUSINESS: {
                    g.writeString("business");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value);
                }
            }
        }

        @Override
        public AccountType deserialize(JsonParser p) throws IOException, JsonParseException {
            AccountType value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException("Required field missing: " + TAG_FIELD, p.getCurrentLocation());
            }
            else if ("basic".equals(tag)) {
                value = AccountType.BASIC;
            }
            else if ("pro".equals(tag)) {
                value = AccountType.PRO;
            }
            else if ("business".equals(tag)) {
                value = AccountType.BUSINESS;
            }
            else {
                throw new JsonParseException("Unknown tag: " + tag, p.getCurrentLocation());
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
