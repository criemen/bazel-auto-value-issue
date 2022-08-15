package s;

import java.util.Optional;

class Test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
		int s = SemanticVersion.INCLUDE_PRERELEASE;
    }

	public static SemanticVersion create(int major, int minor, int patch, Optional<String> preRelease,
			Optional<String> buildMetadata) {
		return new AutoValue_SemanticVersion(major, minor, patch, preRelease, buildMetadata);
	}

}