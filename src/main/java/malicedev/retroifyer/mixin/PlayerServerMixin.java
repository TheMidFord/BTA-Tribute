package malicedev.retroifyer.mixin;




import net.minecraft.server.entity.player.PlayerServer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin (value = PlayerServer.class, remap = false)
public class PlayerServerMixin {

}
