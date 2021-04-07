// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.GeoBackupPolicyInner;

/** An immutable client-side representation of GeoBackupPolicy. */
public interface GeoBackupPolicy {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of geo backup policy. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the location property: Backup policy location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the state property: The state of the geo backup policy.
     *
     * @return the state value.
     */
    GeoBackupPolicyState state();

    /**
     * Gets the storageType property: The storage type of the geo backup policy.
     *
     * @return the storageType value.
     */
    String storageType();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.GeoBackupPolicyInner object.
     *
     * @return the inner object.
     */
    GeoBackupPolicyInner innerModel();

    /** The entirety of the GeoBackupPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithState,
            DefinitionStages.WithCreate {
    }
    /** The GeoBackupPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the GeoBackupPolicy definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the GeoBackupPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, sqlPoolName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @param sqlPoolName SQL pool name.
             * @return the next definition stage.
             */
            WithState withExistingSqlPool(String resourceGroupName, String workspaceName, String sqlPoolName);
        }
        /** The stage of the GeoBackupPolicy definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: The state of the geo backup policy..
             *
             * @param state The state of the geo backup policy.
             * @return the next definition stage.
             */
            WithCreate withState(GeoBackupPolicyState state);
        }
        /**
         * The stage of the GeoBackupPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GeoBackupPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GeoBackupPolicy create(Context context);
        }
    }
    /**
     * Begins update for the GeoBackupPolicy resource.
     *
     * @return the stage of resource update.
     */
    GeoBackupPolicy.Update update();

    /** The template for GeoBackupPolicy update. */
    interface Update extends UpdateStages.WithState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GeoBackupPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GeoBackupPolicy apply(Context context);
    }
    /** The GeoBackupPolicy update stages. */
    interface UpdateStages {
        /** The stage of the GeoBackupPolicy update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: The state of the geo backup policy..
             *
             * @param state The state of the geo backup policy.
             * @return the next definition stage.
             */
            Update withState(GeoBackupPolicyState state);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    GeoBackupPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GeoBackupPolicy refresh(Context context);
}