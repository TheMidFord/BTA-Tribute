package malicedev.retroifyer.HourglassRetro;

import malicedev.retroifyer.ModItems;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.projectile.Projectile;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;

public class ProjectileHourglassRetro extends Projectile {
	public ProjectileHourglassRetro(World world) {
		super(world);
		this.modelItem = ModItems.HourglassRetro;
	}

	public ProjectileHourglassRetro(World world, Mob owner) {
		super(world, owner);
		this.modelItem = ModItems.HourglassRetro;
	}

	public ProjectileHourglassRetro(World world, double x, double y, double z) {
		super(world, x, y, z);
		this.modelItem = ModItems.HourglassRetro;
	}
}
