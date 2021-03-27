export const formatDifficulty = (difficulty: string) => {
  const color =
    difficulty === "Extrémní"
      ? "§4"
      : difficulty === "Těžká"
      ? "§c"
      : difficulty === "Střední"
      ? "§e"
      : "§a";

  return `${color}${difficulty}`;
};

export class NoDifficultyException extends Error {
  constructor(missionName: string) {
    super(`No difficulty found for mission: ${missionName}`);
    this.name = "NoDifficultyException";
  }
}
