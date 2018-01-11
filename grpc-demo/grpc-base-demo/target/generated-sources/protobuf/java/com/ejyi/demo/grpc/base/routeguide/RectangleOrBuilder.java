// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package com.ejyi.demo.grpc.base.routeguide;

public interface RectangleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:routeguide.Rectangle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   */
  boolean hasLo();
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   */
  com.ejyi.demo.grpc.base.routeguide.Point getLo();
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   */
  com.ejyi.demo.grpc.base.routeguide.PointOrBuilder getLoOrBuilder();

  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   */
  boolean hasHi();
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   */
  com.ejyi.demo.grpc.base.routeguide.Point getHi();
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   */
  com.ejyi.demo.grpc.base.routeguide.PointOrBuilder getHiOrBuilder();
}
