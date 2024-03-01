    Server Side (Server.java):
        The server creates a ServerSocket object and binds it to a port (2000 in this case).
        It waits for incoming client connections using the accept() method, which blocks until a client connects.
        Once a client connects, it accepts the connection and establishes communication with the client.
        It then creates input and output streams to communicate with the client.
        Inside the infinite loop, it continuously reads messages from the client using readLine() and sends responses back to the client using println().

    Client Side (Client.java):
        The client creates a Socket object and connects it to the server's IP address (in this case, "localhost") and port (2000).
        It creates input and output streams for communication with the server.
        Inside the loop, it continuously reads user input from the console using readLine() and sends it to the server using writeBytes().
        It also reads responses from the server using readLine() and prints them to the console.
