// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.ejyi.demo.springboot.grpc.proto.hello;

public interface HelloReply2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.HelloReply2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>int32 id = 2;</code>
   */
  int getId();

  /**
   * <code>.helloworld.HelloReply1 helloReply1 = 3;</code>
   */
  boolean hasHelloReply1();
  /**
   * <code>.helloworld.HelloReply1 helloReply1 = 3;</code>
   */
  com.ejyi.demo.springboot.grpc.proto.hello.HelloReply1 getHelloReply1();
  /**
   * <code>.helloworld.HelloReply1 helloReply1 = 3;</code>
   */
  com.ejyi.demo.springboot.grpc.proto.hello.HelloReply1OrBuilder getHelloReply1OrBuilder();

  /**
   * <code>map&lt;string, .helloworld.HelloReply1&gt; map = 4;</code>
   */
  int getMapCount();
  /**
   * <code>map&lt;string, .helloworld.HelloReply1&gt; map = 4;</code>
   */
  boolean containsMap(
      java.lang.String key);
  /**
   * Use {@link #getMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.ejyi.demo.springboot.grpc.proto.hello.HelloReply1>
  getMap();
  /**
   * <code>map&lt;string, .helloworld.HelloReply1&gt; map = 4;</code>
   */
  java.util.Map<java.lang.String, com.ejyi.demo.springboot.grpc.proto.hello.HelloReply1>
  getMapMap();
  /**
   * <code>map&lt;string, .helloworld.HelloReply1&gt; map = 4;</code>
   */

  com.ejyi.demo.springboot.grpc.proto.hello.HelloReply1 getMapOrDefault(
      java.lang.String key,
      com.ejyi.demo.springboot.grpc.proto.hello.HelloReply1 defaultValue);
  /**
   * <code>map&lt;string, .helloworld.HelloReply1&gt; map = 4;</code>
   */

  com.ejyi.demo.springboot.grpc.proto.hello.HelloReply1 getMapOrThrow(
      java.lang.String key);
}
