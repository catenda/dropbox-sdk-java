/* DO NOT EDIT */
/* This file was generated from team_members.stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public enum MembersGetInfoError {
    // union MembersGetInfoError
    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    OTHER; // *catch_all

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<MembersGetInfoError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(MembersGetInfoError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public MembersGetInfoError deserialize(JsonParser p) throws IOException, JsonParseException {
            MembersGetInfoError value;
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
            else {
                value = MembersGetInfoError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
