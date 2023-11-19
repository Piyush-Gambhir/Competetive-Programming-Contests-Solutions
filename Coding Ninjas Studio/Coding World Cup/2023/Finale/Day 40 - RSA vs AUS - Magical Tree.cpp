void dfs(int vertex, int parent_vertex, int &timer, set<pair<int, int>> &bridge_set, vector<bool> &visited_nodes, vector<int> &entry_time, vector<int> &lowest_entry, vector<int> &parent_array, vector<vector<int>> &adjacency_list)
{
    visited_nodes[vertex] = true;
    entry_time[vertex] = lowest_entry[vertex] = timer++;
    parent_array[vertex] = parent_vertex;
    for (int adjacent : adjacency_list[vertex])
    {
        if (adjacent == parent_vertex)
            continue;
        if (visited_nodes[adjacent])
        {
            lowest_entry[vertex] = min(lowest_entry[vertex], entry_time[adjacent]);
        }
        else
        {
            dfs(adjacent, vertex, timer, bridge_set, visited_nodes, entry_time, lowest_entry, parent_array, adjacency_list);
            lowest_entry[vertex] = min(lowest_entry[vertex], lowest_entry[adjacent]);
            if (lowest_entry[adjacent] > entry_time[vertex])
            {
                bridge_set.insert({min(adjacent, vertex), max(adjacent, vertex)});
            }
        }
    }
}

void find_bridges(int num_vertices, set<pair<int, int>> &bridge_set, vector<bool> &visited_nodes, vector<int> &entry_time, vector<int> &lowest_entry, vector<int> &parent_array, vector<vector<int>> &adjacency_list)
{
    int timer = 0;
    for (int i = 0; i < num_vertices; ++i)
    {
        if (!visited_nodes[i])
            dfs(i, -1, timer, bridge_set, visited_nodes, entry_time, lowest_entry, parent_array, adjacency_list);
    }
}

void dfs_recursive(int vertex, int distance, vector<int> &depth, vector<bool> &visited_nodes, vector<vector<pair<int, int>>> &adjacency_list)
{
    visited_nodes[vertex] = true;
    depth[vertex] = distance;
    for (auto neighbor : adjacency_list[vertex])
    {
        int adjacent = neighbor.first;
        int weight = neighbor.second;
        if (!visited_nodes[adjacent])
        {
            dfs_recursive(adjacent, distance + weight, depth, visited_nodes, adjacency_list);
        }
    }
}

int magicalTree(int num_vertices, int num_edges, vector<vector<int>> &edges_list)
{
    vector<vector<int>> adj_list(num_vertices + 1);
    vector<bool> visited(num_vertices + 1, false);
    vector<int> entry_time(num_vertices + 1, -1), lowest_entry(num_vertices + 1, -1), parent(num_vertices + 1, -1);
    for (int i = 0; i < num_edges; i++)
    {
        adj_list[edges_list[i][0]].push_back(edges_list[i][1]);
        adj_list[edges_list[i][1]].push_back(edges_list[i][0]);
    }
    set<pair<int, int>> bridge_set;
    find_bridges(num_vertices, bridge_set, visited, entry_time, lowest_entry, parent, adj_list);
    int total_bridges = bridge_set.size();
    vector<vector<pair<int, int>>> adj_new(num_vertices + 1);
    for (int i = 2; i <= num_vertices; i++)
    {
        int v = parent[i];
        int w = 0;
        if (bridge_set.count({min(i, v), max(i, v)}))
        {
            w = 1;
        }
        adj_new[i].push_back({v, w});
        adj_new[v].push_back({i, w});
    }
    visited.assign(num_vertices + 1, false);
    vector<int> node_depth;
    node_depth.assign(num_vertices + 1, 0);
    dfs_recursive(1, 0, node_depth, visited, adj_new);
    int max_depth_node = 0, max_depth = 0;
    for (int i = 1; i <= num_vertices; i++)
    {
        if (max_depth < node_depth[i])
        {
            max_depth = node_depth[i];
            max_depth_node = i;
        }
    }
    visited.assign(num_vertices + 1, false);
    node_depth.assign(num_vertices + 1, 0);
    dfs_recursive(max_depth_node, 0, node_depth, visited, adj_new);
    int diameter = *max_element(node_depth.begin(), node_depth.end());
    return (total_bridges - diameter);
}
