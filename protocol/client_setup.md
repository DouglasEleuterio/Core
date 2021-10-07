# Client Setup Messages
The messages in this category are generally used when establishing a connection between a client and a server.

### Identification
```
type id: 0
nickname: String
```
This message is sent by the client to the server immediately upon opening a TCP socket to the server.

### ServerWelcome
```
type id: 1
clientId: UUID
currentChannelId: UUID
currentChannelName: String
metaData: ServerMetaData
```
This message is sent by the server in response to an `Identification` message from a new client and after the client has been successfully registered as connected to the server. See the **ServerMetaData** message type for information about its structure.

### Chat
```
type id: 2
id: UUID
senderId: UUID
senderNickname: String
timestamp: long
message: string
```
This message can be sent by both the client and server. When sent by the client, it indicates that the client wishes to send a message in its current channel. The server may accept or reject this request. If accepted, the message will be added to the channel's history, and broadcast to all other clients in the channel. When sent by the server, this indicates that another client has sent a message in the channel that the receiving client is in, and that we should append this chat message to our local representation of the chat history. Additionally, chats are sent as part of a **ChatHistoryResponse**.

TODO: Add more message types.