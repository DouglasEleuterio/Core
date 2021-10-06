package io.github.concord_communication.core.msg.types;

import io.github.concord_communication.core.msg.Message;

import java.util.UUID;

/**
 * Standard set of user data that is used mainly as a component of other more
 * complex messages.
 */
public record UserData (UUID id, String name) implements Message {}
