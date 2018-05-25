/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with wavemaker-com*/
package com.salesdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.salesdb.Customers;
import com.salesdb.States;

/**
 * Service object for domain model class {@link States}.
 */
public interface StatesService {

    /**
     * Creates a new States. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on States if any.
     *
     * @param states Details of the States to be created; value cannot be null.
     * @return The newly created States.
     */
    States create(@Valid States states);


	/**
     * Returns States by given id if exists.
     *
     * @param statesId The id of the States to get; value cannot be null.
     * @return States associated with the given statesId.
	 * @throws EntityNotFoundException If no States is found.
     */
    States getById(Integer statesId);

    /**
     * Find and return the States by given id if exists, returns null otherwise.
     *
     * @param statesId The id of the States to get; value cannot be null.
     * @return States associated with the given statesId.
     */
    States findById(Integer statesId);

	/**
     * Find and return the list of States by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param statesIds The id's of the States to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return States associated with the given statesIds.
     */
    List<States> findByMultipleIds(List<Integer> statesIds, boolean orderedReturn);


    /**
     * Updates the details of an existing States. It replaces all fields of the existing States with the given states.
     *
     * This method overrides the input field values using Server side or database managed properties defined on States if any.
     *
     * @param states The details of the States to be updated; value cannot be null.
     * @return The updated States.
     * @throws EntityNotFoundException if no States is found with given input.
     */
    States update(@Valid States states);

    /**
     * Deletes an existing States with the given id.
     *
     * @param statesId The id of the States to be deleted; value cannot be null.
     * @return The deleted States.
     * @throws EntityNotFoundException if no States found with the given id.
     */
    States delete(Integer statesId);

    /**
     * Deletes an existing States with the given object.
     *
     * @param states The instance of the States to be deleted; value cannot be null.
     */
    void delete(States states);

    /**
     * Find all States matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching States.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<States> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all States matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching States.
     *
     * @see Pageable
     * @see Page
     */
    Page<States> findAll(String query, Pageable pageable);

    /**
     * Exports all States matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all States matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see ExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(ExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the States in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the States.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);

    /*
     * Returns the associated customerses for given States id.
     *
     * @param id value of id; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Customers instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Customers> findAssociatedCustomerses(Integer id, Pageable pageable);

}
