import { snakeCase } from "snake-case";
import missions from "../new_missions.json";
import { matchDifficulty } from "./utils/matcher";

for (const key in missions) {
  const mission = missions[key];
  if (mission.note.toLowerCase() === "tajná mise") continue;

  const id = Number(key) + 47;

  const { mission_name, mission_task, icon: mission_item } = mission;
  const { formatted_difficulty } = matchDifficulty(mission);
  const snake = snakeCase(mission.mission_name);

  console.log(
    [
      "",
      `ItemBuilder ${snake} = new ItemBuilder(Material.${mission_item.toUpperCase()}, 1)`,
      `  .setDisplayNameName("§6§l${mission_name} §8§o(ID ${id})")`,
      `  .addLore("§f${mission_task}.")`,
      `  .addLore("")`,
      `  .addLore("§7Obtížnost: ${formatted_difficulty}")`,
      `  .addLore("")`,
      `  .getQuestStatus(nickname, "${snake}")`,
      `  .addLore("")`,
      `  .addLore("§7Odměna za splnění:");`,
    ].join("\n")
  );
}
