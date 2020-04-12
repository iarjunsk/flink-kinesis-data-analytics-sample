package com.arjunsk.flink.kda.sample.configs;

public final class StreamProcessorConfigConstants {

  // Kinesis Properties
  public static final String KINESIS_SOURCE_GROUP_ID_KEY = "KinesisSourceProperties";
  public static final String KINESIS_SOURCE_STREAM_NAME_KEY = "aws.kinesis.stream.name";

  // Stream Processor Properties
  public static final String STREAM_PROCESSOR_GROUP_ID_KEY = "StreamProcessorProperties";
  public static final String STREAM_PROCESSOR_GREETING_KEY = "application.greet.keyword";

  private StreamProcessorConfigConstants() {}
}
