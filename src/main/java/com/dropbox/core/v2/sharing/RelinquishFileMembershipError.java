/* DO NOT EDIT */
/* This file was generated from sharing_files.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * This class is an open tagged union.  Tagged unions instances are always
 * associated to a specific tag.  This means only one of the {@code isAbc()}
 * methods will return {@code true}. You can use {@link #tag()} to determine the
 * tag associated with this instance.
 *
 * <p> Open unions may be extended in the future with additional tags. If a new
 * tag is introduced that this SDK does not recognized, the {@link #OTHER} value
 * will be used. </p>
 */
public final class RelinquishFileMembershipError {
    // union RelinquishFileMembershipError

    /**
     * Discriminating tag type for {@link RelinquishFileMembershipError}.
     */
    public enum Tag {
        ACCESS_ERROR, // SharingFileAccessError
        /**
         * The current user has access to the shared file via a group.  You
         * can't relinquish membership to a file shared via groups.
         */
        GROUP_ACCESS,
        /**
         * The current user does not have permission to perform this action.
         */
        NO_PERMISSION,
        /**
         * Catch-all used for unknown tag values returned by the Dropbox
         * servers.
         *
         * <p> Receiving a catch-all value typically indicates this SDK version
         * is not up to date. Consider updating your SDK version to handle the
         * new tags. </p>
         */
        OTHER; // *catch_all
    }

    /**
     * The current user has access to the shared file via a group.  You can't
     * relinquish membership to a file shared via groups.
     */
    public static final RelinquishFileMembershipError GROUP_ACCESS = new RelinquishFileMembershipError(Tag.GROUP_ACCESS, null);
    /**
     * The current user does not have permission to perform this action.
     */
    public static final RelinquishFileMembershipError NO_PERMISSION = new RelinquishFileMembershipError(Tag.NO_PERMISSION, null);
    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    public static final RelinquishFileMembershipError OTHER = new RelinquishFileMembershipError(Tag.OTHER, null);

    private final Tag tag;
    private final SharingFileAccessError accessErrorValue;

    /**
     *
     * @param tag  Discriminating tag for this instance.
     */
    private RelinquishFileMembershipError(Tag tag, SharingFileAccessError accessErrorValue) {
        this.tag = tag;
        this.accessErrorValue = accessErrorValue;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code RelinquishFileMembershipError}. </p>
     *
     * <p> If a tag returned by the server is unrecognized by this SDK, the
     * {@link Tag#OTHER} value will be used. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#ACCESS_ERROR}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#ACCESS_ERROR}, {@code false} otherwise.
     */
    public boolean isAccessError() {
        return this.tag == Tag.ACCESS_ERROR;
    }

    /**
     * Returns an instance of {@code RelinquishFileMembershipError} that has its
     * tag set to {@link Tag#ACCESS_ERROR}.
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code RelinquishFileMembershipError} with its tag
     *     set to {@link Tag#ACCESS_ERROR}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static RelinquishFileMembershipError accessError(SharingFileAccessError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new RelinquishFileMembershipError(Tag.ACCESS_ERROR, value);
    }

    /**
     * This instance must be tagged as {@link Tag#ACCESS_ERROR}.
     *
     * @return The {@link RelinquishFileMembershipError#accessError} value
     *     associated with this instance if {@link #isAccessError} is {@code
     *     true}.
     *
     * @throws IllegalStateException  If {@link #isAccessError} is {@code
     *     false}.
     */
    public SharingFileAccessError getAccessErrorValue() {
        if (this.tag != Tag.ACCESS_ERROR) {
            throw new IllegalStateException("Invalid tag: required Tag.ACCESS_ERROR, but was Tag." + tag.name());
        }
        return accessErrorValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#GROUP_ACCESS}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#GROUP_ACCESS}, {@code false} otherwise.
     */
    public boolean isGroupAccess() {
        return this.tag == Tag.GROUP_ACCESS;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#NO_PERMISSION}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#NO_PERMISSION}, {@code false} otherwise.
     */
    public boolean isNoPermission() {
        return this.tag == Tag.NO_PERMISSION;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this.tag == Tag.OTHER;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            tag,
            accessErrorValue
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj instanceof RelinquishFileMembershipError) {
            RelinquishFileMembershipError other = (RelinquishFileMembershipError) obj;
            if (this.tag != other.tag) {
                return false;
            }
            switch (tag) {
                case ACCESS_ERROR:
                    return (this.accessErrorValue == other.accessErrorValue) || (this.accessErrorValue.equals(other.accessErrorValue));
                case GROUP_ACCESS:
                    return true;
                case NO_PERMISSION:
                    return true;
                case OTHER:
                    return true;
                default:
                    return false;
            }
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
    static final class Serializer extends UnionSerializer<RelinquishFileMembershipError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(RelinquishFileMembershipError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case ACCESS_ERROR: {
                    g.writeStartObject();
                    writeTag("access_error", g);
                    g.writeFieldName("access_error");
                    SharingFileAccessError.Serializer.INSTANCE.serialize(value.accessErrorValue, g);
                    g.writeEndObject();
                    break;
                }
                case GROUP_ACCESS: {
                    g.writeString("group_access");
                    break;
                }
                case NO_PERMISSION: {
                    g.writeString("no_permission");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public RelinquishFileMembershipError deserialize(JsonParser p) throws IOException, JsonParseException {
            RelinquishFileMembershipError value;
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
            else if ("access_error".equals(tag)) {
                SharingFileAccessError fieldValue = null;
                expectField("access_error", p);
                fieldValue = SharingFileAccessError.Serializer.INSTANCE.deserialize(p);
                value = RelinquishFileMembershipError.accessError(fieldValue);
            }
            else if ("group_access".equals(tag)) {
                value = RelinquishFileMembershipError.GROUP_ACCESS;
            }
            else if ("no_permission".equals(tag)) {
                value = RelinquishFileMembershipError.NO_PERMISSION;
            }
            else {
                value = RelinquishFileMembershipError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
