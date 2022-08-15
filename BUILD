java_library(
    name = "upstream",
    srcs = ["src/main/java/SemanticVersion.java"],
    deps = [":google_auto_value"],
)

java_library(
    name = "downstream",
    srcs = ["src/main/java/Consumer.java"],
    deps = [":upstream"],
)

java_plugin(
    name = "auto_value_plugin",
    processor_class = "com.google.auto.value.processor.AutoValueProcessor",
    deps = ["@maven//:com_google_auto_value_auto_value"],
)

java_library(
    name = "google_auto_value",
    exported_plugins = [":auto_value_plugin"],
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:com_google_auto_value_auto_value",
        "@maven//:com_google_auto_value_auto_value_annotations",
    ],
)
