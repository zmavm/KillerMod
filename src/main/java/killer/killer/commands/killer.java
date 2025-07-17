package killer.killer.commands;

import net.fabricmc.api.ModInitializer;
import com.mojang.brigadier.Command;
// getString(ctx, "string")
import static com.mojang.brigadier.arguments.StringArgumentType.getString;
// word()
import static com.mojang.brigadier.arguments.StringArgumentType.word;
 // literal("foo")
import static net.minecraft.server.command.CommandManager.literal;
 // argument("bar", word())
import static net.minecraft.server.command.CommandManager.argument;
// Import everything in the CommandManager
import static net.minecraft.server.command.CommandManager.*;

@SuppressWarnings("unused")
public class killer implements ModInitializer {

    @Override
    public void onInitialize() {
        
    }

}
