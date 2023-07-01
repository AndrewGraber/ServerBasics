import org.bukkit.plugin.java.JavaPlugin;

public final class ServerBasics extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("SeverBasics is starting up!");
    }

    @Override
    public void onDisable() {
        System.out.println("ServerBasics is shutting down...");
    }
}
