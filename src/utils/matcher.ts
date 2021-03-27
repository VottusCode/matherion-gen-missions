import { Difficulty, Mission } from "../types";
import { findBestMatch } from "string-similarity";
import difficulties from "../../difficulties.json";
import { snakeCase } from "snake-case";
import { formatDifficulty, NoDifficultyException } from "./diffs";

export interface ProcessedDifficulty extends Difficulty {
  formatted_difficulty: string;
}

export const matchDifficulty = (mission: Mission): ProcessedDifficulty => {
  const bestNameMatch = findBestMatch(
    snakeCase(mission.mission_name.toLowerCase()),
    difficulties.map((el) => snakeCase(el.mission_name.toLowerCase()))
  );

  const difficulty = difficulties.filter(
    (el) =>
      snakeCase(el.mission_name.toLowerCase()) ===
      bestNameMatch.bestMatch.target
  )[0];

  if (!difficulties)
    throw new NoDifficultyException(bestNameMatch.bestMatch.target);

  return {
    ...difficulty,
    formatted_difficulty: formatDifficulty(difficulty.mission_difficulty),
  };
};
