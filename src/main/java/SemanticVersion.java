package s;

import java.util.Optional;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class SemanticVersion {
	public static final int INCLUDE_PRERELEASE = 0x01;


	public abstract int getMajorVersion();
	public abstract int getMinorVersion();
	public abstract int getPatchVersion();
	public abstract Optional<String> getPrereleaseVersion();
	public abstract Optional<String> getBuildMetadata();

	public static SemanticVersion create(int major, int minor, int patch, Optional<String> preRelease,
			Optional<String> buildMetadata) {
		return new AutoValue_SemanticVersion(major, minor, patch, preRelease, buildMetadata);
	}
}
