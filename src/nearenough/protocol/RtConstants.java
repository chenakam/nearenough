package nearenough.protocol;

/**
 * Constants and magic numbers of the Roughtime protocol
 */
public final class RtConstants {

  /** Minimum size (in bytes) of a client request */
  public static final int MIN_REQUEST_LENGTH = 1024;

  /** Size (in bytes) of the client's nonce */
  public static final int NONCE_LENGTH = 64;

  /** Size (in bytes) of server's timestamp value */
  public static final int TIMESTAMP_LENGTH = 8;

  /** Size (in bytes) of server's time uncertainty value */
  public static final int RADIUS_LENGTH = 4;

  /**
   * Prefixed to the server's certificate before generating or verifying certificate's signature
   */
  public static final byte[] CERTIFICATE_CONTEXT = {
      'R', 'o', 'u', 'g', 'h', 'T', 'i', 'm', 'e', ' ',
      'v', '1', ' ',
      'd', 'e', 'l', 'e', 'g', 'a', 't', 'i', 'o', 'n', ' ',
      's', 'i', 'g', 'n', 'a', 't', 'u', 'r', 'e', '-', '-',
      0x00
  };

  /**
   * Prefixed to the server's response before generating or verifying the server's signature
   */
  public static final byte[] SIGNED_RESPONSE_CONTEXT = {
      'R', 'o', 'u', 'g', 'h', 'T', 'i', 'm', 'e', ' ',
      'v', '1', ' ',
      'r', 'e', 's', 'p', 'o', 'n', 's', 'e', ' ',
      's', 'i', 'g', 'n', 'a', 't', 'u', 'r', 'e',
      0x00
  };

  /** Value prepended to leaves prior to hashing */
  public static final byte TREE_LEAF_TWEAK = 0x00;

  /** Value prepended to nodes prior to hashing */
  public static final byte TREE_NODE_TWEAK = 0x01;
}
