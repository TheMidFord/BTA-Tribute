package malicedev.retroifyer.mixin;


import net.minecraft.core.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = Player.class, remap = false)
public class PlayerMixin {
}
