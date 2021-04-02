// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.AcrErrorsException;
import com.azure.containers.containerregistry.models.DeleteRepositoryResult;
import com.azure.containers.containerregistry.models.ListRepositoriesOptions;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

import java.util.Objects;

/** Initializes a new instance of the synchronous ContainerRegistry type. */
@ServiceClient(builder = ContainerRegistryClientBuilder.class)
public final class ContainerRegistryClient {
    private final ContainerRegistryAsyncClient asyncClient;

    /**
     * Initializes an instance of ContainerRegistries client.
     *
     * @param asyncClient the service client implementation.
     */
    ContainerRegistryClient(ContainerRegistryAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * List repositories.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of repositories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<String> listRepositories() {
        return new PagedIterable<>(this.asyncClient.listRepositories());
    }

    /**
     * List repositories.
     *
     * @param options The options to use while getting the list of repositories.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of repositories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<String> listRepositories(ListRepositoriesOptions options, Context context) {
        Objects.requireNonNull(options);

        Integer pageSize = options.getMaxPageSize();
        return new PagedIterable<>(new PagedFlux<>(
            () -> asyncClient.listRepositoriesSinglePageAsync(pageSize, context),
            token -> asyncClient.listRepositoriesNextSinglePageAsync(token, context)));
    }

    /**
     * Delete the repository identified by `name`.
     *
     * @param name Name of the image (including the namespace).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deleted repository.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeleteRepositoryResult deleteRepository(String name) {
        return this.asyncClient.deleteRepository(name).block();
    }

    /**
     * Delete the repository identified by `name`.
     *
     * @param name Name of the image (including the namespace).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deleted repository.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DeleteRepositoryResult> deleteRepositoryWithResponse(String name, Context context) {
        return this.asyncClient.deleteRepositoryWithResponse(name, context).block();
    }
}