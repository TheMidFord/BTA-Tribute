package malicedev.retroifyer;

import malicedev.retroifyer.BlockLogic.TileEntityRetroifyer;
import net.minecraft.client.gui.container.ScreenContainerAbstract;
import net.minecraft.client.input.controller.ControllerInput;
import net.minecraft.core.lang.I18n;
import net.minecraft.core.player.inventory.container.ContainerInventory;
import org.lwjgl.opengl.GL11;

public class RetroifyerGUI extends ScreenContainerAbstract {
	private final TileEntityRetroifyer retroifyerInventory;

	public RetroifyerGUI(ContainerInventory inventory, TileEntityRetroifyer tileEntityRetroifyer) {
		super(new MenuRetroifyer(inventory, tileEntityRetroifyer));
		this.retroifyerInventory = tileEntityRetroifyer;
	}

	protected void drawGuiContainerForegroundLayer() {
		I18n i18n = I18n.getInstance();
			this.font.drawString(i18n.translateKey("gui.retroifyer.label.retroifyer"), 60, 6, 0x64fc49);

		this.font.drawString(i18n.translateKey("gui.retroifyer.label.inventory"), 8, this.ySize - 96 + 2, 0x64fc49);
	}

	protected void drawGuiContainerBackgroundLayer(float f) {
			this.mc.textureManager.loadTexture("/assets/retroifyer/textures/gui/retroifyer.png").bind();

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);


	}

}
