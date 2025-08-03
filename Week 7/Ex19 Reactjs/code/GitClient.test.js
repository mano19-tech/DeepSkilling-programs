import axios from 'axios';
import GitClient from './GitClient';

jest.mock('axios');

describe('Git Client Tests', () => {
  test('should return repository names for techiesyed', async () => {
    // Mock axios response
    const mockRepos = [
      { name: 'repo1' },
      { name: 'repo2' }
    ];
    axios.get.mockResolvedValue({ data: mockRepos });

    // Test GitClient
    const gitClient = new GitClient();
    const result = await gitClient.getRepositories('techiesyed');

    // Verify
    expect(axios.get).toHaveBeenCalledWith(
      'https://api.github.com/users/techiesyed/repos'
    );
    expect(result).toEqual(['repo1', 'repo2']);
  });
});