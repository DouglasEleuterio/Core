/**
 * The core components that are used by both the Concord server and the default
 * client implementation. Includes record-based message serialization, and some
 * utilities for message passing.
 * <p>
 *     This core module defines the message protocol that clients must use to
 *     communicate with any server.
 * </p>
 */
module concord_core {
	exports io.github.concord_communication.core.util;
	exports io.github.concord_communication.core.msg;

	exports io.github.concord_communication.core.msg.types;
	exports io.github.concord_communication.core.msg.types.client_setup;
	exports io.github.concord_communication.core.msg.types.chat;
	exports io.github.concord_communication.core.msg.types.channel;
}