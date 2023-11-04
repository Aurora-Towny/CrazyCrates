package us.crazycrew.crazycrates.common.config.types;

import ch.jalu.configme.Comment;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import java.util.Collections;
import java.util.List;
import static ch.jalu.configme.properties.PropertyInitializer.newListProperty;
import static ch.jalu.configme.properties.PropertyInitializer.newProperty;

public class Config implements SettingsHolder {

    protected Config() {}

    @Override
    public void registerComments(@NotNull CommentsConfiguration conf) {
        String[] header = {
                "Support: https://discord.gg/badbones-s-live-chat-182615261403283459",
                "Github: https://github.com/Crazy-Crew",
                "",
                "Issues: https://github.com/Crazy-Crew/CrazyCrates/issues",
                "Features: https://github.com/Crazy-Crew/CrazyCrates/issues",
                "",
                "List of all sounds: https://jd.papermc.io/paper/1.20/org/bukkit/Sound.html",
                "List of all enchantments: https://jd.papermc.io/paper/1.20/org/bukkit/enchantments/Enchantment.html"
        };

        conf.setComment("Settings", header);
    }

    @Comment("Whether to enable or disable the crate menu.")
    public static final Property<Boolean> enable_crate_menu = newProperty("Settings.Enable-Crate-Menu", true);

    @Comment("Logs all crate actions to file if true. You might have to delete your logs file every now and then.")
    public static final Property<Boolean> log_to_file = newProperty("Settings.Log-File", false);

    @Comment("Logs all crate actions to your console if true.")
    public static final Property<Boolean> log_to_console = newProperty("Settings.Log-Console", false);

    @Comment("The name of the gui (/crates)")
    public static final Property<String> inventory_name = newProperty("Settings.InventoryName", "&b&lCrazy &4&lCrates");

    @Comment("The size of the gui (/crates)")
    public static final Property<Integer> inventory_size = newProperty("Settings.InventorySize", 45);

    @Comment("If crates should knock players back if they don't have a key.")
    public static final Property<Boolean> knock_back = newProperty("Settings.KnockBack", true);

    @Comment("If physical crates can accept virtual keys.")
    public static final Property<Boolean> physical_accepts_virtual_keys = newProperty("Settings.Physical-Accepts-Virtual-Keys", true);

    @Comment("If physical crates can accept physical keys.")
    public static final Property<Boolean> physical_accepts_physical_keys = newProperty("Settings.Physical-Accepts-Physical-Keys", true);

    @Comment("If virtual crates can accept physical keys.")
    public static final Property<Boolean> virtual_accepts_physical_keys = newProperty("Settings.Virtual-Accepts-Physical-Keys", true);

    @Comment("If the player should be given virtual keys if inventory is full. If you leave it as false, All keys will be dropped on the ground.")
    public static final Property<Boolean> give_virtual_keys_when_inventory_full = newProperty("Settings.Give-Virtual-Keys-When-Inventory-Full", false);

    @Comment("If the player should be notified when their inventory is full.")
    public static final Property<Boolean> notify_player_when_inventory_full = newProperty("Settings.Give-Virtual-Keys-When-Inventory-Full-Message", false);

    @Comment("If a sound should be played when a player tries to open a crate with no key.")
    public static final Property<Boolean> need_key_sound_toggle = newProperty("Settings.Need-Key-Sound-Toggle", true);

    @Comment("The sound player when a player tries to open a crate with no key.")
    public static final Property<String> need_key_sound = newProperty("Settings.Need-Key-Sound", "ENTITY_VILLAGER_NO");

    @Comment("How long should quadcrates run for when opened? Once the time is met, The quadcrate closes.")
    public static final Property<Integer> quad_crate_timer = newProperty("Settings.QuadCrate.Timer", 300);

    @Comment("A list of worlds crates are disabled in.")
    public static final Property<List<String>> disabledWorlds = newListProperty("Settings.DisabledWorlds", List.of(
            "world_nether"
    ));

    public static final Property<String> menu_button_item = newProperty("Settings.Preview.Buttons.Menu.Item", "COMPASS");

    public static final Property<String> menu_button_name = newProperty("Settings.Preview.Buttons.Menu.Name", "&7&l>> &c&lMenu &7&l<<");

    public static final Property<List<String>> menu_button_lore = newListProperty("Settings.Preview.Buttons.Menu.Lore", List.of(
            "&7Return to the menu."
    ));

    public static final Property<String> next_button_item = newProperty("Settings.Preview.Buttons.Next.Item", "FEATHER");

    public static final Property<String> next_button_name = newProperty("Settings.Preview.Buttons.Next.Name", "&6&lNext >>");

    public static final Property<List<String>> next_button_lore = newListProperty("Settings.Preview.Buttons.Next.Lore", List.of(
            "&7&lPage: &b%page%"
    ));

    public static final Property<String> back_button_item = newProperty("Settings.Preview.Buttons.Back.Item", "FEATHER");

    public static final Property<String> back_button_name = newProperty("Settings.Preview.Buttons.Back.Name", "&6&l<< Back");

    public static final Property<List<String>> back_button_lore = newListProperty("Settings.Preview.Buttons.Back.Lore", List.of(
            "&7&lPage: &b%page%"
    ));

    public static final Property<Boolean> filler_toggle = newProperty("Settings.Filler.Toggle", true);

    public static final Property<String> filler_item = newProperty("Settings.Filler.Item", "BLACK_STAINED_GLASS_PANE");

    public static final Property<String> filler_name = newProperty("Settings.Filler.Name", " ");

    public static final Property<List<String>> filler_lore = newListProperty("Settings.Filler.Lore", Collections.emptyList());

    public static final Property<Boolean> gui_customizer_toggle = newProperty("Settings.GUI-Customizer-Toggle", true);

    public static final Property<List<String>> gui_customizer = newListProperty("Settings.GUI-Customizer", List.of(
            "Slot:1, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:2, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:3, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:4, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:5, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:6, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:7, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:8, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:9, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:0, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:18, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:19, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:27, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:28, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:36, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:37, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:45, Item:BLACK_STAINED_GLASS_PANE, Name: ",

            "Slot:11, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:12, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:13, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:14, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:15, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:16, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:17, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:20, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:22, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:24, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:26, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:29, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:30, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:31, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:32, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:33, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:34, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:35, Item:WHITE_STAINED_GLASS_PANE, Name: ",
            "Slot:38, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:39, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:40, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:41, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:42, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:43, Item:BLACK_STAINED_GLASS_PANE, Name: ",
            "Slot:44, Item:BLACK_STAINED_GLASS_PANE, Name: "
    ));
}