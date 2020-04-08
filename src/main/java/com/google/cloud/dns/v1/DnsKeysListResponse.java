/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dns.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/** The response to a request to enumerate DnsKeys in a ManagedZone. */
public final class DnsKeysListResponse implements ApiMessage {
  private final List<DnsKey> dnsKeys;
  private final ResponseHeader header;
  private final String kind;
  private final String nextPageToken;

  private DnsKeysListResponse() {
    this.dnsKeys = null;
    this.header = null;
    this.kind = null;
    this.nextPageToken = null;
  }

  private DnsKeysListResponse(
      List<DnsKey> dnsKeys, ResponseHeader header, String kind, String nextPageToken) {
    this.dnsKeys = dnsKeys;
    this.header = header;
    this.kind = kind;
    this.nextPageToken = nextPageToken;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("dnsKeys".equals(fieldName)) {
      return dnsKeys;
    }
    if ("header".equals(fieldName)) {
      return header;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("nextPageToken".equals(fieldName)) {
      return nextPageToken;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /** The requested resources. */
  public List<DnsKey> getDnsKeysList() {
    return dnsKeys;
  }

  public ResponseHeader getHeader() {
    return header;
  }

  /** Type of resource. */
  public String getKind() {
    return kind;
  }

  /**
   * The presence of this field indicates that there exist more results following your last page of
   * results in pagination order. To fetch them, make another list request using this value as your
   * pagination token.
   *
   * <p>In this way you can retrieve the complete contents of even very large collections one page
   * at a time. However, if the contents of the collection change between the first and last
   * paginated list request, the set of all elements returned will be an inconsistent view of the
   * collection. There is no way to retrieve a "snapshot" of collections larger than the maximum
   * page size.
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(DnsKeysListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DnsKeysListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final DnsKeysListResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new DnsKeysListResponse();
  }

  public static class Builder {
    private List<DnsKey> dnsKeys;
    private ResponseHeader header;
    private String kind;
    private String nextPageToken;

    Builder() {}

    public Builder mergeFrom(DnsKeysListResponse other) {
      if (other == DnsKeysListResponse.getDefaultInstance()) return this;
      if (other.getDnsKeysList() != null) {
        this.dnsKeys = other.dnsKeys;
      }
      if (other.getHeader() != null) {
        this.header = other.header;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNextPageToken() != null) {
        this.nextPageToken = other.nextPageToken;
      }
      return this;
    }

    Builder(DnsKeysListResponse source) {
      this.dnsKeys = source.dnsKeys;
      this.header = source.header;
      this.kind = source.kind;
      this.nextPageToken = source.nextPageToken;
    }

    /** The requested resources. */
    public List<DnsKey> getDnsKeysList() {
      return dnsKeys;
    }

    /** The requested resources. */
    public Builder addAllDnsKeys(List<DnsKey> dnsKeys) {
      if (this.dnsKeys == null) {
        this.dnsKeys = new LinkedList<>();
      }
      this.dnsKeys.addAll(dnsKeys);
      return this;
    }

    /** The requested resources. */
    public Builder addDnsKeys(DnsKey dnsKeys) {
      if (this.dnsKeys == null) {
        this.dnsKeys = new LinkedList<>();
      }
      this.dnsKeys.add(dnsKeys);
      return this;
    }

    public ResponseHeader getHeader() {
      return header;
    }

    public Builder setHeader(ResponseHeader header) {
      this.header = header;
      return this;
    }

    /** Type of resource. */
    public String getKind() {
      return kind;
    }

    /** Type of resource. */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * The presence of this field indicates that there exist more results following your last page
     * of results in pagination order. To fetch them, make another list request using this value as
     * your pagination token.
     *
     * <p>In this way you can retrieve the complete contents of even very large collections one page
     * at a time. However, if the contents of the collection change between the first and last
     * paginated list request, the set of all elements returned will be an inconsistent view of the
     * collection. There is no way to retrieve a "snapshot" of collections larger than the maximum
     * page size.
     */
    public String getNextPageToken() {
      return nextPageToken;
    }

    /**
     * The presence of this field indicates that there exist more results following your last page
     * of results in pagination order. To fetch them, make another list request using this value as
     * your pagination token.
     *
     * <p>In this way you can retrieve the complete contents of even very large collections one page
     * at a time. However, if the contents of the collection change between the first and last
     * paginated list request, the set of all elements returned will be an inconsistent view of the
     * collection. There is no way to retrieve a "snapshot" of collections larger than the maximum
     * page size.
     */
    public Builder setNextPageToken(String nextPageToken) {
      this.nextPageToken = nextPageToken;
      return this;
    }

    public DnsKeysListResponse build() {

      return new DnsKeysListResponse(dnsKeys, header, kind, nextPageToken);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllDnsKeys(this.dnsKeys);
      newBuilder.setHeader(this.header);
      newBuilder.setKind(this.kind);
      newBuilder.setNextPageToken(this.nextPageToken);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DnsKeysListResponse{"
        + "dnsKeys="
        + dnsKeys
        + ", "
        + "header="
        + header
        + ", "
        + "kind="
        + kind
        + ", "
        + "nextPageToken="
        + nextPageToken
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DnsKeysListResponse) {
      DnsKeysListResponse that = (DnsKeysListResponse) o;
      return Objects.equals(this.dnsKeys, that.getDnsKeysList())
          && Objects.equals(this.header, that.getHeader())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.nextPageToken, that.getNextPageToken());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsKeys, header, kind, nextPageToken);
  }
}
