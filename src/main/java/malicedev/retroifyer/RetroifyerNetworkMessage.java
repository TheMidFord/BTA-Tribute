package malicedev.retroifyer;

import malicedev.retroifyer.BlockLogic.TileEntityRetroifyer;
import net.minecraft.client.Minecraft;
import org.jspecify.annotations.NonNull;
import turniplabs.halplibe.helper.network.NetworkMessage;
import turniplabs.halplibe.helper.network.UniversalPacket;

public class RetroifyerNetworkMessage implements NetworkMessage {
	public int x, y, z;

	public RetroifyerNetworkMessage() {};
	public RetroifyerNetworkMessage(int x, int y,int z) {

		this.x = x;
			this.y = y;
				this.z =z;
	};

	@Override
	public void encodeToUniversalPacket(@NonNull UniversalPacket packet) {
		packet.writeInt(x);
		packet.writeInt(y);
		packet.writeInt(z);
	}

	@Override
	public void decodeFromUniversalPacket(@NonNull UniversalPacket packet) {
		this.x = packet.readInt();
		this.y = packet.readInt();
		this.z = packet.readInt();
	}

	@Override
	public void handleClientEnv(NetworkContext context) {
		TileEntityRetroifyer tile = (TileEntityRetroifyer) context.player.world.getTileEntity(x,y,z);
		Minecraft.getMinecraft().displayScreen(new RetroifyerGUI(context.player.inventory, tile));
	}
}
