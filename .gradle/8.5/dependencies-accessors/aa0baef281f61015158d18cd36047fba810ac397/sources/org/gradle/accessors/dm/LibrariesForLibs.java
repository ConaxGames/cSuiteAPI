package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final CoLibraryAccessors laccForCoLibraryAccessors = new CoLibraryAccessors(owner);
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Returns the group of libraries at co
     */
    public CoLibraryAccessors getCo() {
        return laccForCoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at com
     */
    public ComLibraryAccessors getCom() {
        return laccForComLibraryAccessors;
    }

    /**
     * Returns the group of libraries at org
     */
    public OrgLibraryAccessors getOrg() {
        return laccForOrgLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class CoLibraryAccessors extends SubDependencyFactory {
        private final CoAikarLibraryAccessors laccForCoAikarLibraryAccessors = new CoAikarLibraryAccessors(owner);

        public CoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at co.aikar
         */
        public CoAikarLibraryAccessors getAikar() {
            return laccForCoAikarLibraryAccessors;
        }

    }

    public static class CoAikarLibraryAccessors extends SubDependencyFactory {
        private final CoAikarAcfLibraryAccessors laccForCoAikarAcfLibraryAccessors = new CoAikarAcfLibraryAccessors(owner);

        public CoAikarLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at co.aikar.acf
         */
        public CoAikarAcfLibraryAccessors getAcf() {
            return laccForCoAikarAcfLibraryAccessors;
        }

    }

    public static class CoAikarAcfLibraryAccessors extends SubDependencyFactory {

        public CoAikarAcfLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for paper (co.aikar:acf-paper)
         * with versionRef 'co.aikar.acf.paper'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaper() {
                return create("co.aikar.acf.paper");
        }

    }

    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComConaxgamesLibraryAccessors laccForComConaxgamesLibraryAccessors = new ComConaxgamesLibraryAccessors(owner);
        private final ComGithubLibraryAccessors laccForComGithubLibraryAccessors = new ComGithubLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.conaxgames
         */
        public ComConaxgamesLibraryAccessors getConaxgames() {
            return laccForComConaxgamesLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.github
         */
        public ComGithubLibraryAccessors getGithub() {
            return laccForComGithubLibraryAccessors;
        }

    }

    public static class ComConaxgamesLibraryAccessors extends SubDependencyFactory {
        private final ComConaxgamesClibrariesLibraryAccessors laccForComConaxgamesClibrariesLibraryAccessors = new ComConaxgamesClibrariesLibraryAccessors(owner);

        public ComConaxgamesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.conaxgames.clibraries
         */
        public ComConaxgamesClibrariesLibraryAccessors getClibraries() {
            return laccForComConaxgamesClibrariesLibraryAccessors;
        }

    }

    public static class ComConaxgamesClibrariesLibraryAccessors extends SubDependencyFactory {

        public ComConaxgamesClibrariesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (com.conaxgames:clibraries-plugin)
         * with versionRef 'com.conaxgames.clibraries.plugin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() {
                return create("com.conaxgames.clibraries.plugin");
        }

    }

    public static class ComGithubLibraryAccessors extends SubDependencyFactory {
        private final ComGithubCryptomorinLibraryAccessors laccForComGithubCryptomorinLibraryAccessors = new ComGithubCryptomorinLibraryAccessors(owner);

        public ComGithubLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.github.cryptomorin
         */
        public ComGithubCryptomorinLibraryAccessors getCryptomorin() {
            return laccForComGithubCryptomorinLibraryAccessors;
        }

    }

    public static class ComGithubCryptomorinLibraryAccessors extends SubDependencyFactory {

        public ComGithubCryptomorinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for xseries (com.github.cryptomorin:XSeries)
         * with versionRef 'com.github.cryptomorin.xseries'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getXseries() {
                return create("com.github.cryptomorin.xseries");
        }

    }

    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgMongodbLibraryAccessors laccForOrgMongodbLibraryAccessors = new OrgMongodbLibraryAccessors(owner);
        private final OrgProjectlombokLibraryAccessors laccForOrgProjectlombokLibraryAccessors = new OrgProjectlombokLibraryAccessors(owner);
        private final OrgSpigotmcLibraryAccessors laccForOrgSpigotmcLibraryAccessors = new OrgSpigotmcLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mongodb
         */
        public OrgMongodbLibraryAccessors getMongodb() {
            return laccForOrgMongodbLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.projectlombok
         */
        public OrgProjectlombokLibraryAccessors getProjectlombok() {
            return laccForOrgProjectlombokLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.spigotmc
         */
        public OrgSpigotmcLibraryAccessors getSpigotmc() {
            return laccForOrgSpigotmcLibraryAccessors;
        }

    }

    public static class OrgMongodbLibraryAccessors extends SubDependencyFactory {
        private final OrgMongodbMongoLibraryAccessors laccForOrgMongodbMongoLibraryAccessors = new OrgMongodbMongoLibraryAccessors(owner);

        public OrgMongodbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mongodb.mongo
         */
        public OrgMongodbMongoLibraryAccessors getMongo() {
            return laccForOrgMongodbMongoLibraryAccessors;
        }

    }

    public static class OrgMongodbMongoLibraryAccessors extends SubDependencyFactory {
        private final OrgMongodbMongoJavaLibraryAccessors laccForOrgMongodbMongoJavaLibraryAccessors = new OrgMongodbMongoJavaLibraryAccessors(owner);

        public OrgMongodbMongoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mongodb.mongo.java
         */
        public OrgMongodbMongoJavaLibraryAccessors getJava() {
            return laccForOrgMongodbMongoJavaLibraryAccessors;
        }

    }

    public static class OrgMongodbMongoJavaLibraryAccessors extends SubDependencyFactory {

        public OrgMongodbMongoJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for driver (org.mongodb:mongo-java-driver)
         * with versionRef 'org.mongodb.mongo.java.driver'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDriver() {
                return create("org.mongodb.mongo.java.driver");
        }

    }

    public static class OrgProjectlombokLibraryAccessors extends SubDependencyFactory {

        public OrgProjectlombokLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for lombok (org.projectlombok:lombok)
         * with versionRef 'org.projectlombok.lombok'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLombok() {
                return create("org.projectlombok.lombok");
        }

    }

    public static class OrgSpigotmcLibraryAccessors extends SubDependencyFactory {

        public OrgSpigotmcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for spigot (org.spigotmc:spigot)
         * with versionRef 'org.spigotmc.spigot'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSpigot() {
                return create("org.spigotmc.spigot");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final CoVersionAccessors vaccForCoVersionAccessors = new CoVersionAccessors(providers, config);
        private final ComVersionAccessors vaccForComVersionAccessors = new ComVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.co
         */
        public CoVersionAccessors getCo() {
            return vaccForCoVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.com
         */
        public ComVersionAccessors getCom() {
            return vaccForComVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

    }

    public static class CoVersionAccessors extends VersionFactory  {

        private final CoAikarVersionAccessors vaccForCoAikarVersionAccessors = new CoAikarVersionAccessors(providers, config);
        public CoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.co.aikar
         */
        public CoAikarVersionAccessors getAikar() {
            return vaccForCoAikarVersionAccessors;
        }

    }

    public static class CoAikarVersionAccessors extends VersionFactory  {

        private final CoAikarAcfVersionAccessors vaccForCoAikarAcfVersionAccessors = new CoAikarAcfVersionAccessors(providers, config);
        public CoAikarVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.co.aikar.acf
         */
        public CoAikarAcfVersionAccessors getAcf() {
            return vaccForCoAikarAcfVersionAccessors;
        }

    }

    public static class CoAikarAcfVersionAccessors extends VersionFactory  {

        public CoAikarAcfVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: co.aikar.acf.paper (0.5.1-SNAPSHOT)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPaper() { return getVersion("co.aikar.acf.paper"); }

    }

    public static class ComVersionAccessors extends VersionFactory  {

        private final ComConaxgamesVersionAccessors vaccForComConaxgamesVersionAccessors = new ComConaxgamesVersionAccessors(providers, config);
        private final ComGithubVersionAccessors vaccForComGithubVersionAccessors = new ComGithubVersionAccessors(providers, config);
        public ComVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.conaxgames
         */
        public ComConaxgamesVersionAccessors getConaxgames() {
            return vaccForComConaxgamesVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.com.github
         */
        public ComGithubVersionAccessors getGithub() {
            return vaccForComGithubVersionAccessors;
        }

    }

    public static class ComConaxgamesVersionAccessors extends VersionFactory  {

        private final ComConaxgamesClibrariesVersionAccessors vaccForComConaxgamesClibrariesVersionAccessors = new ComConaxgamesClibrariesVersionAccessors(providers, config);
        public ComConaxgamesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.conaxgames.clibraries
         */
        public ComConaxgamesClibrariesVersionAccessors getClibraries() {
            return vaccForComConaxgamesClibrariesVersionAccessors;
        }

    }

    public static class ComConaxgamesClibrariesVersionAccessors extends VersionFactory  {

        public ComConaxgamesClibrariesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: com.conaxgames.clibraries.plugin (LATEST)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("com.conaxgames.clibraries.plugin"); }

    }

    public static class ComGithubVersionAccessors extends VersionFactory  {

        private final ComGithubCryptomorinVersionAccessors vaccForComGithubCryptomorinVersionAccessors = new ComGithubCryptomorinVersionAccessors(providers, config);
        public ComGithubVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.github.cryptomorin
         */
        public ComGithubCryptomorinVersionAccessors getCryptomorin() {
            return vaccForComGithubCryptomorinVersionAccessors;
        }

    }

    public static class ComGithubCryptomorinVersionAccessors extends VersionFactory  {

        public ComGithubCryptomorinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: com.github.cryptomorin.xseries (8.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getXseries() { return getVersion("com.github.cryptomorin.xseries"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgMongodbVersionAccessors vaccForOrgMongodbVersionAccessors = new OrgMongodbVersionAccessors(providers, config);
        private final OrgProjectlombokVersionAccessors vaccForOrgProjectlombokVersionAccessors = new OrgProjectlombokVersionAccessors(providers, config);
        private final OrgSpigotmcVersionAccessors vaccForOrgSpigotmcVersionAccessors = new OrgSpigotmcVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.mongodb
         */
        public OrgMongodbVersionAccessors getMongodb() {
            return vaccForOrgMongodbVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.projectlombok
         */
        public OrgProjectlombokVersionAccessors getProjectlombok() {
            return vaccForOrgProjectlombokVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.spigotmc
         */
        public OrgSpigotmcVersionAccessors getSpigotmc() {
            return vaccForOrgSpigotmcVersionAccessors;
        }

    }

    public static class OrgMongodbVersionAccessors extends VersionFactory  {

        private final OrgMongodbMongoVersionAccessors vaccForOrgMongodbMongoVersionAccessors = new OrgMongodbMongoVersionAccessors(providers, config);
        public OrgMongodbVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.mongodb.mongo
         */
        public OrgMongodbMongoVersionAccessors getMongo() {
            return vaccForOrgMongodbMongoVersionAccessors;
        }

    }

    public static class OrgMongodbMongoVersionAccessors extends VersionFactory  {

        private final OrgMongodbMongoJavaVersionAccessors vaccForOrgMongodbMongoJavaVersionAccessors = new OrgMongodbMongoJavaVersionAccessors(providers, config);
        public OrgMongodbMongoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.mongodb.mongo.java
         */
        public OrgMongodbMongoJavaVersionAccessors getJava() {
            return vaccForOrgMongodbMongoJavaVersionAccessors;
        }

    }

    public static class OrgMongodbMongoJavaVersionAccessors extends VersionFactory  {

        public OrgMongodbMongoJavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.mongodb.mongo.java.driver (3.8.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDriver() { return getVersion("org.mongodb.mongo.java.driver"); }

    }

    public static class OrgProjectlombokVersionAccessors extends VersionFactory  {

        public OrgProjectlombokVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.projectlombok.lombok (1.18.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLombok() { return getVersion("org.projectlombok.lombok"); }

    }

    public static class OrgSpigotmcVersionAccessors extends VersionFactory  {

        public OrgSpigotmcVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.spigotmc.spigot (1.8.8-R0.1-SNAPSHOT)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSpigot() { return getVersion("org.spigotmc.spigot"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
