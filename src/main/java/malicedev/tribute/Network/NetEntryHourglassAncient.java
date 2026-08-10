package malicedev.tribute.Network;

import com.mojang.nbt.tags.CompoundTag;
import malicedev.tribute.HourglassRetro.ProjectileHourglassAncient;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.net.entity.EntityTracker;
import net.minecraft.core.net.entity.EntityTrackerEntry;
import net.minecraft.core.net.entity.ITrackedEntry;
import net.minecraft.core.net.entity.IVehicleEntry;
import net.minecraft.core.net.packet.PacketAddEntity;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NetEntryHourglassAncient implements IVehicleEntry<ProjectileHourglassAncient>, ITrackedEntry<ProjectileHourglassAncient> {
	public @NotNull Class<ProjectileHourglassAncient> getAppliedClass() {
		return ProjectileHourglassAncient.class;
	}

	public int getTrackingDistance() {
		return 64;
	}

	@Override
	public int getMovementPacketDelay() {
		return 0;
	}

	public int getPacketDelay() {
		return 1;
	}

	public boolean sendMotionUpdates() {
		return true;
	}

	public void onEntityTracked(EntityTracker tracker, EntityTrackerEntry trackerEntry, ProjectileHourglassAncient trackedObject) {
	}

	public Entity getEntity(World world, double x, double y, double z, int metadata, boolean hasVelocity, double xd, double yd, double zd, Entity owner, @Nullable CompoundTag tag) {
		return new ProjectileHourglassAncient(world, x, y, z);
	}

	public PacketAddEntity getSpawnPacket(EntityTrackerEntry tracker, ProjectileHourglassAncient trackedObject) {
		return new PacketAddEntity(trackedObject);
	}
}
