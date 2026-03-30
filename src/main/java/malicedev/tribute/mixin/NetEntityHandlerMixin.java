package malicedev.tribute.mixin;


import malicedev.tribute.HourglassRetro.ProjectileHourglassRetro;
import malicedev.tribute.Network.NetEntryHourglassAncient;
import malicedev.tribute.Network.NetEntryHourglassNormal;
import malicedev.tribute.Network.NetEntryHourglassRetro;
import net.minecraft.core.net.entity.NetEntityHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = NetEntityHandler.class, remap = false)
public class NetEntityHandlerMixin {
	@Inject(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/net/entity/NetEntityHandler;registerNetworkEntry(Lnet/minecraft/core/net/entity/INetworkEntry;)V", ordinal = 0))
	private static void register(CallbackInfo ci) { // BTA is a bit silly and we need ours to be registered first to work properly, luckily theres no documentation so hopefully no one else ever needs to know the edge cases of the entity handler code
		NetEntityHandler.registerNetworkEntry(new NetEntryHourglassRetro(), 1002);
		NetEntityHandler.registerNetworkEntry(new NetEntryHourglassAncient(), 1003);
		NetEntityHandler.registerNetworkEntry(new NetEntryHourglassNormal(), 1004);
	}
}
