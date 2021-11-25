// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.P2SVpnGatewayInner;
import com.azure.resourcemanager.network.fluent.models.VpnProfileResponseInner;
import com.azure.resourcemanager.network.models.P2SVpnProfileParameters;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in P2SVpnGatewaysClient. */
public interface P2SVpnGatewaysClient
    extends InnerSupportsGet<P2SVpnGatewayInner>, InnerSupportsListing<P2SVpnGatewayInner>, InnerSupportsDelete<Void> {
    /**
     * Retrieves the details of a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<P2SVpnGatewayInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String gatewayName);

    /**
     * Retrieves the details of a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<P2SVpnGatewayInner> getByResourceGroupAsync(String resourceGroupName, String gatewayName);

    /**
     * Retrieves the details of a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    P2SVpnGatewayInner getByResourceGroup(String resourceGroupName, String gatewayName);

    /**
     * Retrieves the details of a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<P2SVpnGatewayInner> getByResourceGroupWithResponse(
        String resourceGroupName, String gatewayName, Context context);

    /**
     * Creates a virtual wan p2s vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to create or Update a virtual wan p2s vpn gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String gatewayName, P2SVpnGatewayInner p2SVpnGatewayParameters);

    /**
     * Creates a virtual wan p2s vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to create or Update a virtual wan p2s vpn gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<P2SVpnGatewayInner>, P2SVpnGatewayInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String gatewayName, P2SVpnGatewayInner p2SVpnGatewayParameters);

    /**
     * Creates a virtual wan p2s vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to create or Update a virtual wan p2s vpn gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<P2SVpnGatewayInner>, P2SVpnGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String gatewayName, P2SVpnGatewayInner p2SVpnGatewayParameters);

    /**
     * Creates a virtual wan p2s vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to create or Update a virtual wan p2s vpn gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<P2SVpnGatewayInner>, P2SVpnGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String gatewayName, P2SVpnGatewayInner p2SVpnGatewayParameters, Context context);

    /**
     * Creates a virtual wan p2s vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to create or Update a virtual wan p2s vpn gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<P2SVpnGatewayInner> createOrUpdateAsync(
        String resourceGroupName, String gatewayName, P2SVpnGatewayInner p2SVpnGatewayParameters);

    /**
     * Creates a virtual wan p2s vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to create or Update a virtual wan p2s vpn gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    P2SVpnGatewayInner createOrUpdate(
        String resourceGroupName, String gatewayName, P2SVpnGatewayInner p2SVpnGatewayParameters);

    /**
     * Creates a virtual wan p2s vpn gateway if it doesn't exist else updates the existing gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to create or Update a virtual wan p2s vpn gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    P2SVpnGatewayInner createOrUpdate(
        String resourceGroupName, String gatewayName, P2SVpnGatewayInner p2SVpnGatewayParameters, Context context);

    /**
     * Updates virtual wan p2s vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to update a virtual wan p2s vpn gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateTagsWithResponseAsync(
        String resourceGroupName, String gatewayName, TagsObject p2SVpnGatewayParameters);

    /**
     * Updates virtual wan p2s vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to update a virtual wan p2s vpn gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<P2SVpnGatewayInner>, P2SVpnGatewayInner> beginUpdateTagsAsync(
        String resourceGroupName, String gatewayName, TagsObject p2SVpnGatewayParameters);

    /**
     * Updates virtual wan p2s vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to update a virtual wan p2s vpn gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<P2SVpnGatewayInner>, P2SVpnGatewayInner> beginUpdateTags(
        String resourceGroupName, String gatewayName, TagsObject p2SVpnGatewayParameters);

    /**
     * Updates virtual wan p2s vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to update a virtual wan p2s vpn gateway tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<P2SVpnGatewayInner>, P2SVpnGatewayInner> beginUpdateTags(
        String resourceGroupName, String gatewayName, TagsObject p2SVpnGatewayParameters, Context context);

    /**
     * Updates virtual wan p2s vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to update a virtual wan p2s vpn gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<P2SVpnGatewayInner> updateTagsAsync(
        String resourceGroupName, String gatewayName, TagsObject p2SVpnGatewayParameters);

    /**
     * Updates virtual wan p2s vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to update a virtual wan p2s vpn gateway tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    P2SVpnGatewayInner updateTags(String resourceGroupName, String gatewayName, TagsObject p2SVpnGatewayParameters);

    /**
     * Updates virtual wan p2s vpn gateway tags.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param p2SVpnGatewayParameters Parameters supplied to update a virtual wan p2s vpn gateway tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnGateway Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    P2SVpnGatewayInner updateTags(
        String resourceGroupName, String gatewayName, TagsObject p2SVpnGatewayParameters, Context context);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String gatewayName);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String gatewayName);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String gatewayName);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String gatewayName, Context context);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String gatewayName);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String gatewayName);

    /**
     * Deletes a virtual wan p2s vpn gateway.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String gatewayName, Context context);

    /**
     * Lists all the P2SVpnGateways in a resource group.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<P2SVpnGatewayInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all the P2SVpnGateways in a resource group.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<P2SVpnGatewayInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the P2SVpnGateways in a resource group.
     *
     * @param resourceGroupName The resource group name of the P2SVpnGateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<P2SVpnGatewayInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the P2SVpnGateways in a subscription.
     *
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<P2SVpnGatewayInner> listAsync();

    /**
     * Lists all the P2SVpnGateways in a subscription.
     *
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<P2SVpnGatewayInner> list();

    /**
     * Lists all the P2SVpnGateways in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list P2SVpnGateways.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<P2SVpnGatewayInner> list(Context context);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> generateVpnProfileWithResponseAsync(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<VpnProfileResponseInner>, VpnProfileResponseInner> beginGenerateVpnProfileAsync(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnProfileResponseInner>, VpnProfileResponseInner> beginGenerateVpnProfile(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnProfileResponseInner>, VpnProfileResponseInner> beginGenerateVpnProfile(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters, Context context);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VpnProfileResponseInner> generateVpnProfileAsync(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnProfileResponseInner generateVpnProfile(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters);

    /**
     * Generates VPN profile for P2S client of the P2SVpnGateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the P2SVpnGateway.
     * @param parameters Parameters supplied to the generate P2SVpnGateway VPN client package operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnProfileResponseInner generateVpnProfile(
        String resourceGroupName, String gatewayName, P2SVpnProfileParameters parameters, Context context);
}