// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Route.proto

package com.example.grpc.route;

public final class Route {
  private Route() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FindRouteMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.grpc.route.FindRouteMessage)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code com.example.grpc.route.FindRouteMessage}
   */
  public  static final class FindRouteMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.example.grpc.route.FindRouteMessage)
      FindRouteMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FindRouteMessage.newBuilder() to construct.
    private FindRouteMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FindRouteMessage() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FindRouteMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.route.Route.internal_static_com_example_grpc_route_FindRouteMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.route.Route.internal_static_com_example_grpc_route_FindRouteMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.route.Route.FindRouteMessage.class, com.example.grpc.route.Route.FindRouteMessage.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.example.grpc.route.Route.FindRouteMessage)) {
        return super.equals(obj);
      }
      com.example.grpc.route.Route.FindRouteMessage other = (com.example.grpc.route.Route.FindRouteMessage) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.grpc.route.Route.FindRouteMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.example.grpc.route.Route.FindRouteMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.example.grpc.route.FindRouteMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.grpc.route.FindRouteMessage)
        com.example.grpc.route.Route.FindRouteMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.grpc.route.Route.internal_static_com_example_grpc_route_FindRouteMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.grpc.route.Route.internal_static_com_example_grpc_route_FindRouteMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.grpc.route.Route.FindRouteMessage.class, com.example.grpc.route.Route.FindRouteMessage.Builder.class);
      }

      // Construct using com.example.grpc.route.Route.FindRouteMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.grpc.route.Route.internal_static_com_example_grpc_route_FindRouteMessage_descriptor;
      }

      public com.example.grpc.route.Route.FindRouteMessage getDefaultInstanceForType() {
        return com.example.grpc.route.Route.FindRouteMessage.getDefaultInstance();
      }

      public com.example.grpc.route.Route.FindRouteMessage build() {
        com.example.grpc.route.Route.FindRouteMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.example.grpc.route.Route.FindRouteMessage buildPartial() {
        com.example.grpc.route.Route.FindRouteMessage result = new com.example.grpc.route.Route.FindRouteMessage(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.grpc.route.Route.FindRouteMessage) {
          return mergeFrom((com.example.grpc.route.Route.FindRouteMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.grpc.route.Route.FindRouteMessage other) {
        if (other == com.example.grpc.route.Route.FindRouteMessage.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.example.grpc.route.Route.FindRouteMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.grpc.route.Route.FindRouteMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.example.grpc.route.FindRouteMessage)
    }

    // @@protoc_insertion_point(class_scope:com.example.grpc.route.FindRouteMessage)
    private static final com.example.grpc.route.Route.FindRouteMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.grpc.route.Route.FindRouteMessage();
    }

    public static com.example.grpc.route.Route.FindRouteMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FindRouteMessage>
        PARSER = new com.google.protobuf.AbstractParser<FindRouteMessage>() {
      public FindRouteMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new FindRouteMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FindRouteMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FindRouteMessage> getParserForType() {
      return PARSER;
    }

    public com.example.grpc.route.Route.FindRouteMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ShortRouteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.grpc.route.ShortRoute)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string point = 1;</code>
     */
    java.util.List<java.lang.String>
        getPointList();
    /**
     * <code>repeated string point = 1;</code>
     */
    int getPointCount();
    /**
     * <code>repeated string point = 1;</code>
     */
    java.lang.String getPoint(int index);
    /**
     * <code>repeated string point = 1;</code>
     */
    com.google.protobuf.ByteString
        getPointBytes(int index);
  }
  /**
   * Protobuf type {@code com.example.grpc.route.ShortRoute}
   */
  public  static final class ShortRoute extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.example.grpc.route.ShortRoute)
      ShortRouteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShortRoute.newBuilder() to construct.
    private ShortRoute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShortRoute() {
      point_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShortRoute(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                point_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              point_.add(s);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          point_ = point_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.route.Route.internal_static_com_example_grpc_route_ShortRoute_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.route.Route.internal_static_com_example_grpc_route_ShortRoute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.route.Route.ShortRoute.class, com.example.grpc.route.Route.ShortRoute.Builder.class);
    }

    public static final int POINT_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList point_;
    /**
     * <code>repeated string point = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPointList() {
      return point_;
    }
    /**
     * <code>repeated string point = 1;</code>
     */
    public int getPointCount() {
      return point_.size();
    }
    /**
     * <code>repeated string point = 1;</code>
     */
    public java.lang.String getPoint(int index) {
      return point_.get(index);
    }
    /**
     * <code>repeated string point = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPointBytes(int index) {
      return point_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < point_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, point_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < point_.size(); i++) {
          dataSize += computeStringSizeNoTag(point_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getPointList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.example.grpc.route.Route.ShortRoute)) {
        return super.equals(obj);
      }
      com.example.grpc.route.Route.ShortRoute other = (com.example.grpc.route.Route.ShortRoute) obj;

      boolean result = true;
      result = result && getPointList()
          .equals(other.getPointList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPointCount() > 0) {
        hash = (37 * hash) + POINT_FIELD_NUMBER;
        hash = (53 * hash) + getPointList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.grpc.route.Route.ShortRoute parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.grpc.route.Route.ShortRoute parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.grpc.route.Route.ShortRoute parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.grpc.route.Route.ShortRoute parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.example.grpc.route.Route.ShortRoute prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.example.grpc.route.ShortRoute}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.grpc.route.ShortRoute)
        com.example.grpc.route.Route.ShortRouteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.grpc.route.Route.internal_static_com_example_grpc_route_ShortRoute_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.grpc.route.Route.internal_static_com_example_grpc_route_ShortRoute_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.grpc.route.Route.ShortRoute.class, com.example.grpc.route.Route.ShortRoute.Builder.class);
      }

      // Construct using com.example.grpc.route.Route.ShortRoute.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        point_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.grpc.route.Route.internal_static_com_example_grpc_route_ShortRoute_descriptor;
      }

      public com.example.grpc.route.Route.ShortRoute getDefaultInstanceForType() {
        return com.example.grpc.route.Route.ShortRoute.getDefaultInstance();
      }

      public com.example.grpc.route.Route.ShortRoute build() {
        com.example.grpc.route.Route.ShortRoute result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.example.grpc.route.Route.ShortRoute buildPartial() {
        com.example.grpc.route.Route.ShortRoute result = new com.example.grpc.route.Route.ShortRoute(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          point_ = point_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.point_ = point_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.grpc.route.Route.ShortRoute) {
          return mergeFrom((com.example.grpc.route.Route.ShortRoute)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.grpc.route.Route.ShortRoute other) {
        if (other == com.example.grpc.route.Route.ShortRoute.getDefaultInstance()) return this;
        if (!other.point_.isEmpty()) {
          if (point_.isEmpty()) {
            point_ = other.point_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePointIsMutable();
            point_.addAll(other.point_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.example.grpc.route.Route.ShortRoute parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.grpc.route.Route.ShortRoute) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList point_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensurePointIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          point_ = new com.google.protobuf.LazyStringArrayList(point_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getPointList() {
        return point_.getUnmodifiableView();
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public int getPointCount() {
        return point_.size();
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public java.lang.String getPoint(int index) {
        return point_.get(index);
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPointBytes(int index) {
        return point_.getByteString(index);
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public Builder setPoint(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePointIsMutable();
        point_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public Builder addPoint(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePointIsMutable();
        point_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public Builder addAllPoint(
          java.lang.Iterable<java.lang.String> values) {
        ensurePointIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, point_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public Builder clearPoint() {
        point_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string point = 1;</code>
       */
      public Builder addPointBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensurePointIsMutable();
        point_.add(value);
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.example.grpc.route.ShortRoute)
    }

    // @@protoc_insertion_point(class_scope:com.example.grpc.route.ShortRoute)
    private static final com.example.grpc.route.Route.ShortRoute DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.grpc.route.Route.ShortRoute();
    }

    public static com.example.grpc.route.Route.ShortRoute getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShortRoute>
        PARSER = new com.google.protobuf.AbstractParser<ShortRoute>() {
      public ShortRoute parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ShortRoute(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShortRoute> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShortRoute> getParserForType() {
      return PARSER;
    }

    public com.example.grpc.route.Route.ShortRoute getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_route_FindRouteMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_route_FindRouteMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_route_ShortRoute_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_route_ShortRoute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Route.proto\022\026com.example.grpc.route\"\022\n" +
      "\020FindRouteMessage\"\033\n\nShortRoute\022\r\n\005point" +
      "\030\001 \003(\t2v\n\021RouteServiceProto\022a\n\021FindShort" +
      "estRoute\022(.com.example.grpc.route.FindRo" +
      "uteMessage\032\".com.example.grpc.route.Shor" +
      "tRouteb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_route_FindRouteMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_route_FindRouteMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_route_FindRouteMessage_descriptor,
        new java.lang.String[] { });
    internal_static_com_example_grpc_route_ShortRoute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_route_ShortRoute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_route_ShortRoute_descriptor,
        new java.lang.String[] { "Point", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
