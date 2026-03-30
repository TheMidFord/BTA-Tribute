package malicedev.tribute.Network;

import com.mojang.nbt.tags.CompoundTag;
import malicedev.tribute.HourglassRetro.ProjectileHourglassRetro;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.net.entity.EntityTracker;
import net.minecraft.core.net.entity.EntityTrackerEntry;
import net.minecraft.core.net.entity.ITrackedEntry;
import net.minecraft.core.net.entity.IVehicleEntry;
import net.minecraft.core.net.packet.PacketAddEntity;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NetEntryHourglassRetro implements IVehicleEntry<ProjectileHourglassRetro>, ITrackedEntry<ProjectileHourglassRetro> {
	public @NotNull Class<ProjectileHourglassRetro> getAppliedClass() {
		return ProjectileHourglassRetro.class;
	}

	public int getTrackingDistance() {
		return 64;
	}

	public int getPacketDelay() {
		return 1;
	}

	public boolean sendMotionUpdates() {
		return false;
	}

	public void onEntityTracked(EntityTracker tracker, EntityTrackerEntry trackerEntry, ProjectileHourglassRetro trackedObject) {
	}

	public Entity getEntity(World world, double x, double y, double z, int metadata, boolean hasVelocity, double xd, double yd, double zd, Entity owner, @Nullable CompoundTag tag) {
		return new ProjectileHourglassRetro(world, x, y, z);
	}

	public PacketAddEntity getSpawnPacket(EntityTrackerEntry tracker, ProjectileHourglassRetro trackedObject) {
		return new PacketAddEntity(trackedObject);
	}
}
