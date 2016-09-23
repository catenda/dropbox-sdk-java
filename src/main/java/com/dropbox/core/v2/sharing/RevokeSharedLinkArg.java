/* DO NOT EDIT */
/* This file was generated from shared_links.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

class RevokeSharedLinkArg {
    // struct RevokeSharedLinkArg

    protected final String url;

    /**
     *
     * @param url  URL of the shared link. Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public RevokeSharedLinkArg(String url) {
        if (url == null) {
            throw new IllegalArgumentException("Required value for 'url' is null");
        }
        this.url = url;
    }

    /**
     * URL of the shared link.
     *
     * @return value for this field, never {@code null}.
     */
    public String getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            url
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
            RevokeSharedLinkArg other = (RevokeSharedLinkArg) obj;
            return (this.url == other.url) || (this.url.equals(other.url));
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
    static final class Serializer extends StructSerializer<RevokeSharedLinkArg> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(RevokeSharedLinkArg value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("url");
            StoneSerializers.string().serialize(value.url, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public RevokeSharedLinkArg deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            RevokeSharedLinkArg value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_url = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("url".equals(field)) {
                        f_url = StoneSerializers.string().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_url == null) {
                    throw new JsonParseException("Required field \"url\" missing.", p.getCurrentLocation());
                }
                value = new RevokeSharedLinkArg(f_url);
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
