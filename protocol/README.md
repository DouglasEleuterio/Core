# Concord Messaging Protocol
This document describes the messaging protocol that the Concord server will use to communicate with clients on persistent TCP connections, and over UDP for any lossy communications such as voice or video streaming.

TODO: Publish this documentation to GitHub pages.

## Messages
The basis of Concord's TCP messaging protocol is the concept of a **message**, whose only uniform aspect is that every message **MUST** begin with a single byte that defines the type of message. This is shown below as a `type id`.

There are some conventions which are observed when communicating certain complex data types in messages.

- Any `String` value is written as a 4-byte integer value defining the length of the string, followed by exactly that many bytes of content. A `null` string is written as a length of `-1`, without any bytes following it.
- Any enumeration value is written as the 4-byte integer ordinal value of the enumeration value, or `-1` if the value is `null`.
- Any `UUID` is written as two consecutive 8-byte long integers; the most significant bits are followed by the least significant bits. If the value is `null`, two consecutive `-1` values are written.
- A list of zero or more messages is written as a 4-byte integer value denoting the number of messages, followed by exactly that many messages. Only uniform lists of messages of the same type are supported.

For details about specific message types, please see one of the other markdown files in this directory.
