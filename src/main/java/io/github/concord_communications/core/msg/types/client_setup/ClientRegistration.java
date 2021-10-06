package io.github.concord_communications.core.msg.types.client_setup;

import io.github.concord_communications.core.msg.Message;

/**
 * The data that new users should send to a server in order to register in that
 * server.
 */
public record ClientRegistration(
		String name,
		String description,
		String username,
		String password
) implements Message {}
