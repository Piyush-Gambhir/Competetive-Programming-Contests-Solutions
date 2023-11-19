from collections import defaultdict


def dfs(vertex, parent_vertex, timer, bridge_set, visited_nodes, entry_time, lowest_entry, parent_array, adjacency_list):
    visited_nodes[vertex] = True
    entry_time[vertex] = lowest_entry[vertex] = timer
    timer += 1
    parent_array[vertex] = parent_vertex
    for adjacent in adjacency_list[vertex]:
        if adjacent == parent_vertex:
            continue
        if visited_nodes[adjacent]:
            lowest_entry[vertex] = min(
                lowest_entry[vertex], entry_time[adjacent])
        else:
            dfs(adjacent, vertex, timer, bridge_set, visited_nodes,
                entry_time, lowest_entry, parent_array, adjacency_list)
            lowest_entry[vertex] = min(
                lowest_entry[vertex], lowest_entry[adjacent])
        if lowest_entry[adjacent] > entry_time[vertex]:
            bridge_set.add((min(adjacent, vertex), max(adjacent, vertex)))


def find_bridges(num_vertices, bridge_set, visited_nodes, entry_time, lowest_entry, parent_array, adjacency_list):
    timer = 0
    for i in range(num_vertices):
        if not visited_nodes[i]:
            dfs(i, -1, timer, bridge_set, visited_nodes, entry_time,
                lowest_entry, parent_array, adjacency_list)


def dfs_recursive(vertex, distance, depth, visited_nodes, adjacency_list):
    visited_nodes[vertex] = True
    depth[vertex] = distance
    for neighbor, weight in adjacency_list[vertex]:
        if not visited_nodes[neighbor]:
            dfs_recursive(neighbor, distance + weight, depth,
                          visited_nodes, adjacency_list)


def magicalTree(num_vertices, num_edges, edges_list):
    adj_list = defaultdict(list)
    visited = [False] * (num_vertices + 1)
    entry_time = [-1] * (num_vertices + 1)
    lowest_entry = [-1] * (num_vertices + 1)
    parent = [-1] * (num_vertices + 1)
    for i in range(num_edges):
        # Assuming all edges have weight 1
        adj_list[edges_list[i][1]].append((edges_list[i][0], 1))
    bridge_set = set()
    find_bridges(num_vertices, bridge_set, visited,
                 entry_time, lowest_entry, parent, adj_list)
    total_bridges = len(bridge_set)
    adj_new = defaultdict(list)
    for i in range(2, num_vertices + 1):
        v = parent[i]
        if (min(i, v), max(i, v)) in bridge_set:
            adj_new[i].append((v, 1))  # Assuming all edges have weight 1
            adj_new[v].append((i, 1))  # Assuming all edges have weight 1
    visited = [False] * (num_vertices + 1)
    node_depth = [0] * (num_vertices + 1)
    dfs_recursive(1, 0, node_depth, visited, adj_new)
    max_depth_node = 0
    max_depth = 0
    for i in range(1, num_vertices + 1):
        if max_depth < node_depth[i]:
            max_depth = node_depth[i]
            max_depth_node = i
    visited = [False] * (num_vertices + 1)
    node_depth = [0] * (num_vertices + 1)
    dfs_recursive(max_depth_node, 0, node_depth, visited, adj_new)
    diameter = max(node_depth)
    return total_bridges - diameter
