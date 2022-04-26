import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import reactor.core.publisher.Mono;
import java.lang.Math;
import java.util.Scanner;

public static void main (string[] args){
        DiscordClient client = DiscordClient.create("TOKEN");
        Mono<Void> login = client.withGateway((GatewayDiscordClient gateway) ->
        gateway.on(ReadyEvent.class, event ->
        Mono.fromRunnable(() -> {
            final User self = event.getSelf();
        System.out.printf("Logged in as %s#%s%n", self.getUsername(), self.getDiscriminator());
        })));
        login.block();
}