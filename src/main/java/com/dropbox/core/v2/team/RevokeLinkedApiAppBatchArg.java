/* DO NOT EDIT */
/* This file was generated from team_linked_apps.stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.List;

class RevokeLinkedApiAppBatchArg {
    // struct RevokeLinkedApiAppBatchArg

    protected final List<RevokeLinkedApiAppArg> revokeLinkedApp;

    /**
     *
     * @param revokeLinkedApp  Must not contain a {@code null} item and not be
     *     {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public RevokeLinkedApiAppBatchArg(List<RevokeLinkedApiAppArg> revokeLinkedApp) {
        if (revokeLinkedApp == null) {
            throw new IllegalArgumentException("Required value for 'revokeLinkedApp' is null");
        }
        for (RevokeLinkedApiAppArg x : revokeLinkedApp) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list 'revokeLinkedApp' is null");
            }
        }
        this.revokeLinkedApp = revokeLinkedApp;
    }

    /**
     *
     * @return value for this field, never {@code null}.
     */
    public List<RevokeLinkedApiAppArg> getRevokeLinkedApp() {
        return revokeLinkedApp;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            revokeLinkedApp
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            RevokeLinkedApiAppBatchArg other = (RevokeLinkedApiAppBatchArg) obj;
            return (this.revokeLinkedApp == other.revokeLinkedApp) || (this.revokeLinkedApp.equals(other.revokeLinkedApp));
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static final class Serializer extends StructSerializer<RevokeLinkedApiAppBatchArg> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(RevokeLinkedApiAppBatchArg value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("revoke_linked_app");
            StoneSerializers.list(RevokeLinkedApiAppArg.Serializer.INSTANCE).serialize(value.revokeLinkedApp, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public RevokeLinkedApiAppBatchArg deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            RevokeLinkedApiAppBatchArg value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                List<RevokeLinkedApiAppArg> f_revokeLinkedApp = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("revoke_linked_app".equals(field)) {
                        f_revokeLinkedApp = StoneSerializers.list(RevokeLinkedApiAppArg.Serializer.INSTANCE).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_revokeLinkedApp == null) {
                    throw new JsonParseException("Required field \"revoke_linked_app\" missing.", p.getCurrentLocation());
                }
                value = new RevokeLinkedApiAppBatchArg(f_revokeLinkedApp);
            }
            else {
                throw new JsonParseException("No subtype found that matches tag: \"" + tag + "\"", p.getCurrentLocation());
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
